package mokito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BasicoMockito {
    @Mock
    List<String> animais;
    @Test
    void validarpositionOfList(){
        Mockito.when(animais.get(0)).thenReturn("Leão");
        Assertions.assertEquals("Leão", animais.get(0));
    }
}
