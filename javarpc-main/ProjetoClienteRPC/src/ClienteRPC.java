import java.net.URL;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ClienteRPC {

    private XmlRpcClient cliente;
	
    public ClienteRPC(String urlServidor) {
		try {
			//configura o cliente para que ele possa se conectar ao servidor
			XmlRpcClientConfigImpl configuracaoCliente = new XmlRpcClientConfigImpl();
            configuracaoCliente.setServerURL(new URL(urlServidor));
			//seta a configuração no cliente
            cliente = new XmlRpcClient();
            cliente.setConfig(configuracaoCliente);
        } catch (Exception exception) {
            System.err.println("JavaServer: " + exception);
        }
    }

    public int AreaQuadrado(int lado) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(lado)};
        Integer resultado = (Integer) cliente.execute("Calc.AreaQuadrado", parametros);
        return resultado;
    }

    public int AreaTrianguloRetangulo(int base, int altura) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(base), Integer.valueOf(altura)};
        Integer resultado = (Integer) cliente.execute("Calc.AreaTrianguloRetangulo", parametros);
        return resultado;
    }

    public double AreaCircunferencia(int raio) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio)};
        Double resultado = (Double) cliente.execute("Calc.AreaCircunferencia", parametros);
        return resultado;
    }

    public double AreaEsfera(int raio) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio)};
        Double resultado = (Double) cliente.execute("Calc.AreaEsfera", parametros);
        return resultado;
    }

    public double VolumeEsfera(int raio) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio)};
        Double resultado = (Double) cliente.execute("Calc.VolumeEsfera", parametros);
        return resultado;
    }

    public double AreaCilindro(int raio, int altura) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio), Integer.valueOf(altura)};
        Double resultado = (Double) cliente.execute("Calc.AreaCilindro", parametros);
        return resultado;
    }

    public double VolumeCilindro(int raio, int altura) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio), Integer.valueOf(altura)};
        Double resultado = (Double) cliente.execute("Calc.VolumeCilindro", parametros);
        return resultado;
    }

    public int AreaCubo(int lado) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(lado)};
        int resultado = (Integer) cliente.execute("Calc.AreaCubo", parametros);
        return resultado;
    }

    public int VolumeCubo(int lado) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(lado)};
        int resultado = (Integer) cliente.execute("Calc.VolumeCubo", parametros);
        return resultado;
    }

    // public int multiplicar(int x, int y) throws Exception {
    //     Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
    //     Integer resultado = (Integer) cliente.execute("Calc.multiplicacao", parametros);
    //     return resultado;
    // }

    // public double dividir(int x, int y) throws Exception {
    //     Object[] parametros = new Object[]{Integer.valueOf(x), Integer.valueOf(y)};
    //     Double resultado = (Double) cliente.execute("Calc.divisao", parametros);
    //     return resultado;
    // }	
}







