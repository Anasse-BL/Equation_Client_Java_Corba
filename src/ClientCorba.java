import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import EquationCorba.EquationInterface;
import EquationCorba.EquationInterfaceHelper;

public class ClientCorba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Context ctx = new InitialContext();
				Object ref = ctx.lookup("EQUATION");
				EquationInterface stub = EquationInterfaceHelper.narrow((org.omg.CORBA.Object)ref);
				System.out.println(stub.equation(1,2,1));
				
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}

	}


