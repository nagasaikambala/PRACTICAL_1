open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){   this.age=age
        println("Age $age")
    }
} class Student(firstname:String,lastname:String,age:
Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age:
    Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){   this.batch=batch
        println("Batch $batch")
        println("--------------")
    }
} fun main(){
    var s1=Student("NAGASAI","KAMBALA",20,20012531038,"CE-AI","B","AI2")
    var s2=Student("VENU","KALLAM",20,20012531010,"CE-AI","B","AI2")
    var s3=Student("GANESH","KURRI",21,20012531017,"CE-AI","B","AI2")
    var s4=Student("KARUNAKAR","KONDE",21,200125316,"CE-AI","B","AI2")
    var s5=Student("MANEESH","CHINTAKINDI",22,20012531005,"CE-AI","B","AI2")
}
