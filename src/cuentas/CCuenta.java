package cuentas;

public class CCuenta {

	/**
	 * @param nombre del cliente
	 */
	private String nombre;
	/**
	 * @param n�mero de cuenta del cliente
	 */
	private String cuenta;
	/**
	 *  @param saldo del cliente
	 */
	private double saldo;
	/**
	 * @param tipo de inter�s asociado al cliente
	 */
	private double tipoInter�s;

	/**
	 * Constructor que inicializa los parametros de clase CCuenta
	 */
	public CCuenta() {
	}

	/**
	 * @param nom nombre del cliente
	 * @param cue n�mero de cuenta del cliente
	 * @param sal saldo del cliente
	 * @param tipo tipo de inter�s asociado al cliente
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
	 * *M�todo para comprobar que el cliente ingresa una cantidad positiva y el saldo despu�s del ingreso
	 * @param cantidad Comprueba que la cantidad a ingresar es positiva, ya que no tendr�a sentido un ingreso negativo
	 * @throws Exception Aviso para que el cliente vea que ha intentado ingresar algo negativo
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * *M�todo para comprobar si el cliente puede retirar la cantidad que desea y su saldo despu�s en caso afirmativo
	 * @param cantidad Comprueba que la cantidad a retirar es positiva, y que su valo no supera el l�mite del saldo que tiene el cliente, ya que no puede "deber" dinero
	 * @throws Exception Aviso para que el cliente vea que ha intentado retirar una cantidad negativa o m�s dinero del que dispone
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
	 * @return Da acceso a la variable privada tipoInter�s
	 */
	public double getTipoInter�s() {
		return tipoInter�s;
	}

	/**
	 * @param tipoInter�s Da valor a la variable privada tipoInter�s
	 */
	public void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
}
