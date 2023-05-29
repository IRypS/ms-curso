package com.edu.certus.mscurso.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel( value = "Response DTO", description = "DTO para manejar las respuestas que provea la API Rest" )
public class ResponseDto {
    
    @ApiModelProperty( value = "Código de operación", example = "0", dataType = "integer" )
    private String codigo;

    @ApiModelProperty( value = "Mensaje de respuesta", example = "Operación exitosa", dataType = "string" )
    private String mensaje;

    @ApiModelProperty( value = "Datos resultantes de la operación", dataType = "Object" )
    private Object data;
    
}