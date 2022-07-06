package com.mondaycom
import org.apache.spark.sql.SparkSession
object scalacodemonday {
  def main(args:Array[String]): Unit= {
    // creating spark session
    val spark: SparkSession = SparkSession
      .builder().master("local(*)")
      .appName("DATA FROM AWS S3")
      .getOrCreate()

      val name = "spark"
      val age = 12
  }
}
