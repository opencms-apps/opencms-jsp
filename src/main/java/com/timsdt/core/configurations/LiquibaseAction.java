package com.timsdt.core.configurations;

import liquibase.Contexts;
import liquibase.LabelExpression;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;
import org.opencms.configuration.CmsConfigurationManager;
import org.opencms.db.CmsSqlManager;
import org.opencms.file.CmsObject;
import org.opencms.main.OpenCms;
import org.opencms.module.A_CmsModuleAction;
import org.opencms.module.CmsModule;

import java.sql.Connection;

public class LiquibaseAction extends A_CmsModuleAction {

    @Override
    public void initialize(CmsObject adminCms, CmsConfigurationManager configurationManager, CmsModule module) {
        super.initialize(adminCms, configurationManager, module);
        System.out.println("Create table here !!!");
        this.update();
    }

    public void update() {
        Connection connection;
        CmsSqlManager manager = OpenCms.getSqlManager();
        Database database;
        try {
            connection = manager.getConnection(manager.getDefaultDbPoolName());
            database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(connection));

            Liquibase liquibase = new Liquibase("changelog.sql", new ClassLoaderResourceAccessor(), database);
            liquibase.update(new Contexts(), new LabelExpression());
            System.out.println("RUN :: DONE !!!");
        } catch (Exception e) {
            System.out.println("RUN :: FAIL !!!");
            e.printStackTrace();
        }
    }

    public void rollback(Integer changesToRollback) {
        if (changesToRollback == null) {
            changesToRollback = 1;
        }
        Connection connection;
        CmsSqlManager manager = OpenCms.getSqlManager();
        Database database;
        try {
            connection = manager.getConnection(manager.getDefaultDbPoolName());
            database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(connection));

            Liquibase liquibase = new Liquibase("changelog.sql", new ClassLoaderResourceAccessor(), database);
            liquibase.rollback(changesToRollback, new Contexts(), new LabelExpression());
            System.out.println("RUN :: DONE !!!");
        } catch (Exception e) {
            System.out.println("RUN :: FAIL !!!");
            e.printStackTrace();
        }
    }
}
