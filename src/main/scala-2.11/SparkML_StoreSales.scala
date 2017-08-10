/**
  * Created by oleg.baydakov on 07/04/2017.
  * http://www.sparktutorials.net/Spark+MLLib+-+Predict+Store+Sales+with+ML+Pipelines
  */
package com.examples.oleg

import org.apache.spark
import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkML_StoreSales {

  def loadTrainingData(spark: SparkSession ):DataFrame = {
    val trainRaw = spark.read.option("header", true)
      .csv("C:\\Users\\oleg.baydakov\\Downloads\\train.csv\\train.csv")
      .repartition(6)

    trainRaw.createOrReplaceTempView("raw_training_data")

    spark.sqlContext.sql("""SELECT
    double(Sales) label, double(Store) Store, int(Open) Open, double(DayOfWeek) DayOfWeek,
    StateHoliday, SchoolHoliday, (double(regexp_extract(Date, '\\d+-\\d+-(\\d+)', 1))) DayOfMonth
    FROM raw_training_data
  """).na.drop()
  }






  def main(args: Array[String]): Unit = {
    //println(sc.version)
    val spark1: SparkSession = SparkSession.builder()
      .appName("Spark example")
      .master("local[*]")
      .config("option", "some-value")
      .getOrCreate()


    val sc = spark1.sparkContext
    val sqlContext = spark1.sqlContext

    val data = loadTrainingData(spark1)

    data.show(5)
  }

}

