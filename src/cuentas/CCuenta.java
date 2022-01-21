package cuentas;

public class CCuenta {

	/**
	 * @param nombre del cliente
	 */
	private String nombre;
	/**
	 * @param número de cuenta del cliente
	 */
	private String cuenta;
	/**
	 *  @param saldo del cliente
	 */
	private double saldo;
	/**
	 * @param tipo de interés asociado al cliente
	 */
	private double tipoInterés;

	/**
	 * Constructor que inicializa los parametros de clase CCuenta
	 */
	public CCuenta() {
	}

	/**
	 * @param nom nombre del cliente
	 * @param cue número de cuenta del cliente
	 * @param sal saldo del cliente
	 * @param tipo tipo de interés asociado al cliente
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * @return Devuelve el saldo actual de la cuenta del cliente
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * *Método para comprobar que el cliente ingresa una cantidad positiva y el saldo después del ingreso
	 * @param cantidad Comprueba que la cantidad a ingresar es positiva, ya que no tendría sentido un ingreso negativo
	 * @throws Exception Aviso para que el cliente vea que ha intentado ingresar algo negativo
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * *Método para comprobar si el cliente puede retirar la cantidad que desea y su saldo después en caso afirmativo
	 * @param cantidad Comprueba que la cantidad a retirar es positiva, y que su valo no supera el límite del saldo que tiene el cliente, ya que no puede "deber" dinero
	 * @throws Exception Aviso para que el cliente vea que ha intentado retirar una cantidad negativa o más dinero del que dispone
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}

	/**
	 * @return Da acceso a la variable privada nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Da valor a la variable privada nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Da acceso a la variable privada cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta Da valor a la variable privada cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return Da acceso a la variable privada saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo Da valor a la variable privada saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return Da acceso a la variable privada tipoInterés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés Da valor a la variable privada tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
