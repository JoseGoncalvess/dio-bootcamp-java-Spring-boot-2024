package mokito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.studyTest.classsMocks.GeradorNumberAleatorio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TesteMethodStatic {

    @Test
    void TestandogeraradorTamnhodeNotfinido(){
        List<Integer> listaTeste = new ArrayList<>() ;
        MockedStatic<GeradorNumberAleatorio> mokedStatico = Mockito.mockStatic(GeradorNumberAleatorio.class);
        mokedStatico.when(GeradorNumberAleatorio::gerarNumerosAleatoriosof).thenReturn(new  ArrayList<Integer>(Arrays.asList(1,2,3,6,5,9)));
        Assertions.assertEquals(6, GeradorNumberAleatorio.gerarNumerosAleatoriosof().size());
    }


    // NOTEI QUE AU USARA REFERENCIA DENTOR D EUM TRY AUTOAMTICAMENTE VERIFICO O METDOO ASIM POSSO VALIDAR

    @Test
    void TestandogeraradorTamnhodefinido(){
        List<Integer> listaTeste = new ArrayList<>() ;
        try(MockedStatic<GeradorNumberAleatorio> mokedStatico = Mockito.mockStatic(GeradorNumberAleatorio.class)){
            when(GeradorNumberAleatorio.gerarNumerosAleatorios(anyInt())).thenReturn(new  ArrayList<Integer>(Arrays.asList(3,6,5,9,22,88,9,3)));
            Assertions.assertEquals(8, GeradorNumberAleatorio.gerarNumerosAleatorios(anyInt()).size());
        }





    }








}
