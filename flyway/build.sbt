// Database Migrations:
// run with "sbt flywayMigrate"
// http://flywaydb.org/getstarted/firststeps/sbt.html
lazy val databaseUrl = 
  sys.env.getOrElse("DB_DEFAULT_URL", "jdbc:mysql://192.168.99.100:32768/test")
lazy val databaseUser = sys.env.getOrElse("DB_DEFAULT_USER", "root")
lazy val databasePassword = sys.env.getOrElse("DB_DEFAULT_PASSWORD", "root")

flywayLocations := Seq("classpath:db/migration")
flywayUrl := databaseUrl
flywayUser := databaseUser
flywayPassword := databasePassword
