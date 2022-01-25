package com.king.atmmachine

var pin: Int = 0
var bal: Int = 0

fun main(){
    println("Welcome create your password")
    var createPin = readLine()!!.toInt()
    println("Renter your pin")
    var rePin = readLine()!!.toInt()

    if (createPin != rePin){
        println("Pin don't match please try again")
        main()
    }else{
        println("Password created successfully")
        pin = createPin
        login()
    }
}

fun login(){
    println("Enter your password")

    var entPass = readLine()!!.toInt()
    if (entPass != pin){
        println("Incorrect Pin try again")
        login()
    }else {
        body()
    }
}

fun body(){
    println("Welcome, what do you want to do?")
    println("1. Withdraw")
    println("2. Change Pin")
    println("3. Deposit")
    println("4. Check balance")

    var choice = readLine()!!.toInt()

    when(choice){
        1-> withDraw()
        2-> changePin()
        3-> deposit()
        4-> balance()
        else-> {println("Invalid selection")
            body()
        }
    }
}

fun deposit(){
    println("How much do you want to deposit?")
    println("1. N500")
    println("2. N1000")
    println("3. N2000")
    println("4. N5000")
    println("5. N10000")
    println("6. N20000")
    println("7. Enter the amount")

    var dePo = readLine()!!.toInt()

    when(dePo){
        1-> {
            bal += 500
            println("you have deposited N500 successfully")
            exit()}
        2-> {
            bal += 1000
            println("you have deposited N1000 successfully")
            exit()}
        3-> {
            bal += 2000
            println("you have deposited N2000 successfully")
            body()}
        4-> {
            bal += 5000
            println("you have deposited N5000 successfully")
            body()}
        5-> {
            bal += 10000
            println("you have deposited N10000 successfully")
            body()}
        6-> {
            bal += 20000
            println("you have deposited N20000 successfully")
            body()}
        7-> newDeport()
        else-> {println("Invalid Selection")
            body()}
    }
}

fun newDeport(){
    println("Enter the Amount you want to deposit")

    var newDepo = readLine()!!.toInt()
    println("you have deposited N$newDepo successfully")
    bal += newDepo
    exit()
}

fun changePin(){
    println("Please Enter your password")

    var oldPin = readLine()!!.toInt()
    if (oldPin != pin){
        println("Renter pin")
        changePin()
    } else {
        println("Enter new pin")
        var newPin = readLine()!!.toInt()
        println("Re-enter new pin")
        var reNewPin = readLine()!!.toInt()
        if (newPin!= reNewPin){
            println("Pin don't match")
        }else {
            pin =newPin
            println("Pin changed successfully")
            exit()
        }
    }
}

fun withDraw(){
    println("How much do you want to withdraw?")
    println("1. N500")
    println("2. N1000")
    println("3. N2000")
    println("4. N5000")
    println("5. N10000")
    println("6. N20000")
    println("7. Enter the amount")

    var with= readLine()!!.toInt()
    if(with> bal){
        println("Insufficient funds")
        exit()
    }else{
        when(with){
            1-> {
                bal -= 500
                println("you have withdrawn 500 successfully")
                exit()}
            2-> {
                bal -= 1000
                println("you have deposited 1000 successfully")
                exit()}
            3-> {
                bal -= 2000
                println("you have deposited 2000 successfully")
                exit()}
            4-> {
                bal -= 5000
                println("you have deposited 5000 successfully")
                exit()}
            5-> {
                bal -= 10000
                println("you have deposited 10000 successfully")
                exit()}
            6-> {
                bal -= 20000
                println("you have deposited 20000 successfully")
                exit()}
            7-> newWith()
            else-> {println("Invalid Selection")
                exit()}
        }
    }
}
fun newWith(){
    println("Enter the Amount you want to withdraw")

    var newWit = readLine()!!.toInt()
    println("you have withdrawn N$newWit successfully")
    bal += newWit
    exit()
}

fun exit(){
    println("Do you want to exit or do another transaction?")
    println("1. Other transaction")
    println("2. Exit")

    var option = readLine()!!.toInt()
    if(option == 1){
        login()
    }else {}
}

fun balance(){
    println("Your balance is N$bal")
    exit()
}
