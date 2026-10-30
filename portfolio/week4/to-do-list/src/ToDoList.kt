// COMP2850 Portfolio: Week 4
// ToDoList class
//./kotlin test -m to-do-list

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.count {it.status == ItemStatus.NotStarted }  // compute no. of items with NotStarted status
    val inProgress get() = items.count {it.status == ItemStatus.InProgress }   // compute no. of items with InProgress status
    val done get() = items.count {it.status == ItemStatus.Done }         // compute no. of items with Done status
    val overdue get() = items.count {it.isOverdue()}     // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format

        Path(filename).forEachLine{ line -> // for each line in the file
            val lineParts = line.split(": ", limit = 3) // split the line into the 3 variables (date, status, description)
            val date = LocalDate.parse(lineParts[0]) 
            val status = ItemStatus.valueOf(lineParts[1])
            val description = lineParts[2]
            items.add(ToDoItem(date, status, description)) // using the 3 variables create a new item in the list
        }

    }   

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items){
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        return items.removeAll{it.status == ItemStatus.Done} // remove all items with the status Done
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null

        var newItems = items.toList() //create new list to return (dont want to modify items list)
        if (status == null){
            return newItems // if theres no specified status, return all items
        }
        else{
            newItems = items.filter{it.status == status} // else remove all items without the specified status and return it
            return newItems
        } 
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date

        return items.filter{it.dueDate == date} // return items where due date = specified date
    }
}
