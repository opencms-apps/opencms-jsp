# Helpful JSP file to use
This repository are contains all JSPs I think it's helpful to use

#### To debug on tomcat
```shell
export JPDA_ADDRESS=8000
export JPDA_TRANSPORT=dt_socket

./catalina.sh jpda start && tail -f ../logs/catalina.out
```