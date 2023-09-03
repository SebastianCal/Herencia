open class Empleado(val nombre: String, val edad: Int, val departamento: String?)


class Gerente(nombre: String, edad: Int, departamento: String?, val nivel: String?) : Empleado(nombre, edad, departamento) {
    val empleadosSupervisados = mutableListOf<Empleado>()

    fun supervisar(empleado: Empleado) {
        empleadosSupervisados.add(empleado)
    }
}

fun main() {
    println("Ingrese los datos del empleado:")
    print("Nombre: ")
    val nombreEmpleado = readLine() ?: ""
    print("Edad: ")
    val edadEmpleado = readLine()?.toIntOrNull() ?: 0
    print("Departamento: ")
    val departamentoEmpleado = readLine()


    val empleado = Empleado(nombreEmpleado, edadEmpleado, departamentoEmpleado)


    println("Ingrese los datos del gerente:")
    print("Nombre: ")
    val nombreGerente = readLine() ?: ""
    print("Edad: ")
    val edadGerente = readLine()?.toIntOrNull() ?: 0
    print("Departamento: ")
    val departamentoGerente = readLine()
    print("Nivel: ")
    val nivelGerente = readLine()


    val gerente = Gerente(nombreGerente, edadGerente, departamentoGerente, nivelGerente)


    gerente.supervisar(empleado)


    println("Empleados supervisados por ${gerente.nombre}:")
    for (empleadoSupervisado in gerente.empleadosSupervisados) {
        println("- ${empleadoSupervisado.nombre}")
    }
}
