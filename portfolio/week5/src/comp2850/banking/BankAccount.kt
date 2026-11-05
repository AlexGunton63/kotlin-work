// COMP2850 Portfolio: Week 5
// BankAccount class
//./kotlin test
package comp2850.banking

abstract class BankAccount(val holder: String) {
    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    var balance = 0
        protected set(value) {
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be greater than 0" }
        balance += amount
    }

    abstract fun withdraw(amount: Int)
}
class StudentAccount(holder : String, overdraft : Int = 0) : BankAccount(holder){

    var overdraft: Int = 0
        set(value) {
            require(value in 0..100) {"Overdraft must be between 0 and 100"}
            field = value
        }

    init {
        this.overdraft = overdraft 
    }

    fun withdrawalsAllowed() : Boolean{
        if(balance > -overdraft){
            return true
        }
        else{
            return false
        }
    }
    override fun withdraw(amount: Int){
        if (amount <= 0){
            throw IllegalArgumentException("Withdrawal amount must be greater than 0")
        }

        if(balance - amount >= -overdraft){
            balance = balance - amount
        }
        else{
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
    }
    override fun toString(): String = "Account for $holder, balance = $balance (overdraft = $overdraft)"
    
}