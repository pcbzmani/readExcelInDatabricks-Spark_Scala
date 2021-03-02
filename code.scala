//Specify path
val path = "/FileStore/shared_uploads/pcbzmani@gmail.com/train_Data.xlsx"

//load Train file, option Header is Mandatory

val inpData = spark.read
    .format("com.crealytics.spark.excel")
    .option("Header", "true")
    .option("treatEmptyValuesAsNulls", "true")
    .option("inferSchema", "true")
    .option("addColorColumns", "False")
    .load(path)

inpData.printSchema()

inpData.show(10)
