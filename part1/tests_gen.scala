test

spark.read.textFile("test.txt").count()

spark.read.textFile("test.txt").map(line => line.toInt).sum()

spark.read.textFile("test.txt").map(row=>((line => line.toInt,true,1)(row), row)).orderBy(_1).map(_._2)first()

spark.read.textFile("test.txt").map(line=>line.toInt).max()

spark.read.textFile("test.txt").map(line => line.toInt).filter(num => num > 5).foreach(println)

spark.range(1,101).filter(num=>num%2==0).sum()

select(reduceAggregator(paiubdfpasdifasdf)).collect()

groupByKey(_._1).agg(reduceByKeyAggregator(ouasbdfibasdpofasd))


