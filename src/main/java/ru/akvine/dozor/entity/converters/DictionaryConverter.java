package ru.akvine.dozor.entity.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.List;

@Converter
public class DictionaryConverter implements AttributeConverter<List<String>, String> {
    private static final String SEPARATOR = ",";

    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        StringBuilder sb = new StringBuilder();

        int lastElementIndex = attribute.size() - 1;
        for (int i = 0; i < attribute.size(); ++i) {
            sb.append(attribute.get(i));
            if (i != lastElementIndex) {
                sb.append(SEPARATOR);
            }
        }
        return sb.toString();
    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        return List.of(dbData.split(SEPARATOR));
    }
}
