package bd;
import ModeloCajeroATM.ClienteCajeroATM;
import ModeloCajeroATM.Cuenta;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class BDOperacion extends BDConectar {
	public static List<Cuenta> listaCuentas() {
		List<Cuenta> f = new ArrayList<Cuenta>();
		String q = "SELECT *FROM cuenta";
		try {
			crearConexion();
			ResultSet rs = st.executeQuery(q);
			while (rs.next()) {
				f.add(new Cuenta(rs.getInt("idCuenta"), rs.getString("numero_cuenta"), Integer.parseInt(rs.getString("idUsuario")), rs.getString("tipo"),Double.parseDouble(rs.getString("saldo"))));
                        }
			rs.close();
		} catch (Exception e) {
		//	System.out.println(e.getMessage());
		} finally {
			cerrarConexion();
		}
		return f;
	}
public static void nuevoCuenta(Cuenta f) {
		String q;
		q = "INSERT INTO cuenta (numero_cuenta, tipo, saldo, idUsuario) VALUES ('"+ f.getNumero_cuenta()
				+ "', '"
				+ f.getTipo()
				+ "', '"
				+ f.getSaldo()
                                + "', '"
				+ f.getIdusuario()
                                + "')";
		try {
			crearConexion();
			st.executeUpdate(q);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			cerrarConexion();
                }
    return;
}

//public static void modificarSancion(Sancion f) {
////		String q;
////		q = "UPDATE contacto SET "+ "id = " + f.getId()+ ",nombre = '" + f.getNombre()+ "',telefono = '" + f.getTelefono()+ "',correo = '" + f.getCorreo()+ "'WHERE id = " + f.getId();
////            try {
////			crearConexion();
////                        st.executeUpdate(q);
////                } catch (Exception e) {
////			System.out.println(e.getMessage());
////		} finally {
////			cerrarConexion();
////		}
//		return;
//}
public static void deleteCuenta(int id) {
		String q;
		q = "DELETE FROM cajero " + "WHERE idCuenta = " + id;
		try {
			crearConexion();
			st.executeUpdate(q);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			cerrarConexion();
		}
		return;

}
}
