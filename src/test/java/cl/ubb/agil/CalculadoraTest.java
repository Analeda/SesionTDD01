package cl.ubb.agil;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {

	@Test
	public void sumaDosMasTres(){
		Calculadora calculadora=new Calculadora();
		int r=calculadora.suma(2,3);
		assertThat(r,is(5));
	}
	
	@Test
	public void sumaMenosUnoMasSiete(){
		Calculadora calculadora=new Calculadora();
		int r=calculadora.suma(-1,7);
		assertThat(r,is(6));
	}
	
	@Test
	public void restaDocientosMenosSetentaYTres(){
		Calculadora calculadora=new Calculadora();
		int r=calculadora.resta(200,73);
		assertThat(r,is(127));
	}
	
	@Test
	public void DivisionDoceYtresEsCuatro(){
		Calculadora calculadora=new Calculadora();
		int r=calculadora.division(12,3);
		assertThat(r,is(4));
	}
}
