def call(String msg="BUILD"){
   sh 'mvn clean package'
}
