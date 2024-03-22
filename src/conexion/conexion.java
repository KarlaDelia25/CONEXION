package conexion;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class conexion {

		private static final String controlador = "com.mysql.cj.jdbc.Driver";
		private static final String url = "jdbc:mysql://localhost:3306/empleados";
		private static final String usuario = "root";
		private static final String clave = "";
		
		
		static {
			try {  
				Class.forName(controlador);
					System.out.print("Se cargó el controlador");
		}
			catch(ClassNotFoundException e) {
				System.out.print("error");
				e.printStackTrace();
			}
		}

		public Connection conectar() {
			Connection conexion = null;

			try {
				
				conexion = DriverManager.getConnection(url, usuario, clave);
				System.out.println("Conexión correcta");

		

			} catch (SQLException e) {
				System.out.println("Error en la conexión");
				e.printStackTrace();
			}

			return conexion;
		}

		public static void main(String[] args) {
			conexion y=new conexion();
			y.conectar();

		}

}
