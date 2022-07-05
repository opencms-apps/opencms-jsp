--liquibase formatted sql

--changeset sac.le:1 labels:example-label
--comment: create new table orders
CREATE TABLE AAA_ORDERS
(
    `order_no`   VARCHAR(50) NOT NULL,
    `created_at` TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_no`)
) ENGINE = InnoDB;
--rollback DROP TABLE AAA_ORDERS;