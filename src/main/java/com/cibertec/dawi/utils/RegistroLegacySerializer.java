package com.cibertec.dawi.utils;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;

import com.cibertec.dawi.models.Registro;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class RegistroLegacySerializer implements JsonSerializer<Registro>{

	@Override
	public JsonElement serialize(Registro src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject object = new JsonObject();
        object.addProperty("id", src.getId());
        object.addProperty("descripcion", src.getDescripcion());
        object.addProperty("categoria", src.getCategoria().getNombre());
        object.addProperty("id_categoria", src.getCategoria().getCodigo());
        object.addProperty("impacto", src.getImpacto());
        object.addProperty("fecha", new SimpleDateFormat("yyyy-MM-dd").format(src.getFecha()));
        return object;
	}

}
