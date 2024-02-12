import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.junit.matchers.JUnitMatchers.everyItem;

public class TesteVetorF {

    String nomes = "Bruno-M,Tais-F,Luisa-F,Maria-F,Nelson-M,Aluisio-M,Elza-F,Nelson-M,Rodrigo-M,Luciene-F";
    String[] vetorPrincipal = nomes.split(",");

    List<String> lines = Arrays.stream(vetorPrincipal).toList();
    List<String> vetorF = lines.stream()               
            .filter(line -> line.contains("-F"))
            .collect(Collectors.toList());
    String[] test = vetorF.toArray(new String[0]);
    @Test
    public void testeStringF(){
        assertThat(Arrays.asList(test),everyItem(containsString("-F")));

    }

}
