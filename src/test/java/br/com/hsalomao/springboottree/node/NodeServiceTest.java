package br.com.hsalomao.springboottree.node;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.stereotype.Service;

@Service
public class NodeServiceTest {

    @Mock
    private NodeService service;

    @BeforeEach
    public void before() {
        MockitoAnnotations.initMocks(this);
    }
    

    @Test
    void should_find_all() {
        when(service.findAll()).thenReturn("{label:\"A\", left:\"B\", rigth:\"D\"}, {label:\"B\", left:\"C\", rigth:\"E\"}, {label:\"C\", left:\"F\"}, {label:\"F\"}, {label:\"E\"}, {label:\"D\"}");
        String result = service.findAll();
        assertTrue(StringUtils.isNotBlank(result));
    }
    
}
