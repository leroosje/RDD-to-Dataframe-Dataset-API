#!/bin/bash

(
echo ":paste"
cat function.scala
echo
echo -e "\04"
(cat test.scala; echo) | (
  while read line
  do
    echo "$line"
  done
)

(cat test.sql; echo) | (
  while read line
  do
    [ "$line"x = x ] || echo "spark.sql(\"select $line\").as[String].first"
  done
)
) | spark-shell
