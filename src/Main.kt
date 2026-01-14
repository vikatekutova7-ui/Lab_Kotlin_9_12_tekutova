fun main(){
    val manager = ResourceManager()
    val gas = OutpostResource(id = 1, name = "Gas", amount = 100)
    val minerals = OutpostResource(id = 2, name = "Minerals", amount = 300)
    manager.add(gas)
    manager.add(minerals)
    manager.printAll()
}