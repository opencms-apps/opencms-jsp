```shell
export JPDA_ADDRESS=8000
export JPDA_TRANSPORT=dt_socket

./catalina.sh jpda start && tail -f ../logs/catalina.out
```