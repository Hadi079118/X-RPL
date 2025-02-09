    BEGIN  
    DATA array = {27, 80, 8, 46, 16, 12, 50}  
     
    FUNCTION bubbleSort(DATA array)  
        LENGTH = size of array  
        FOR i FROM 0 TO LENGTH - 1 DO  
            FOR j FROM 0 TO LENGTH - i - 2 DO  
                IF array[j] > array[j + 1] THEN    
                    TEMP = array[j]  
                    array[j] = array[j + 1]  
                    array[j + 1] = TEMP  
                ENDIF  
            ENDFOR  
        ENDFOR  
    ENDFUNCTION  
s
    bubbleSort(array)  

    PRINT "Data setelah diurutkan:"  
    FOR i FROM 0 TO size of array - 1 DO  
        PRINT array[i]  
    ENDFOR  
END