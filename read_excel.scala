import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.{SparkSession}



object readExcel {


  def main(args:Array[String]) {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val spark = SparkSession
      .builder
      .appName("readExcel")
      .master("local[*]")
      .getOrCreate()

    //Specify path
    val path = "H:/Big Data/Loan_Test+Train/Train/Train/train_Data.xlsx"

    //load Train file
    val inpDF = spark.read
      .format("com.crealytics.spark.excel")
      .option("Header", "true")
      .option("treatEmptyValuesAsNulls", "true")
      .option("inferSchema", "true")
      .option("addColorColumns", "False")
      .load(path)




    inpDF.show()
  }
}
