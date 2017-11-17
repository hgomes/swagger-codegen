package io.swagger.codegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CodegenProperty implements Cloneable {
    public String baseName, complexType, getter, setter, description, datatype,
          datatypeWithEnum, dataFormat, name, min, max, defaultValue, defaultValueWithParam,
          baseType, containerType, title;

    /** The 'description' string without escape charcters needed by some programming languages/targets */
    public String unescapedDescription;

    /**
     * maxLength validation for strings, see http://json-schema.org/latest/json-schema-validation.html#rfc.section.5.2.1
     */
    public Integer maxLength;
    /**
     * minLength validation for strings, see http://json-schema.org/latest/json-schema-validation.html#rfc.section.5.2.2
     */
    public Integer minLength;
    /**
     * pattern validation for strings, see http://json-schema.org/latest/json-schema-validation.html#rfc.section.5.2.3
     */
    public String pattern;
    /**
     * A free-form property to include an example of an instance for this schema.
     */
    public String example;

    public String jsonSchema;
    public String minimum;
    public String maximum;
    public boolean exclusiveMinimum;
    public boolean exclusiveMaximum;
    public boolean hasMore, required, secondaryParam;
    public boolean hasMoreNonReadOnly; // for model constructor, true if next properyt is not readonly
    public boolean isPrimitiveType, isContainer, isNotContainer;
    public boolean isString, isNumeric, isInteger, isLong, isNumber, isFloat, isDouble, isByteArray, isBinary, isFile, isBoolean, isDate, isDateTime, isUuid;
    public boolean isListContainer, isMapContainer;
    public boolean isEnum;
    public boolean isReadOnly = false;
    public List<String> _enum;
    public Map<String, Object> allowableValues;
    public CodegenProperty items;
    public Map<String, Object> vendorExtensions;
    public boolean hasValidation; // true if pattern, maximum, etc are set (only used in the mustache template)
    public boolean isInherited;
    public String nameInCamelCase; // property name in camel case
    // enum name based on the property name, usually use as a prefix (e.g. VAR_NAME) for enum name (e.g. VAR_NAME_VALUE1)
    public String enumName;
    public Integer maxItems;
    public Integer minItems;

    // XML
    public boolean isXmlAttribute = false;
    public String xmlPrefix;
    public String xmlName;
    public String xmlNamespace;
    public boolean isXmlWrapped = false;

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getComplexType() {
        return complexType;
    }

    public void setComplexType(String complexType) {
        this.complexType = complexType;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getSetter() {
        return setter;
    }

    public void setSetter(String setter) {
        this.setter = setter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getDatatypeWithEnum() {
        return datatypeWithEnum;
    }

    public void setDatatypeWithEnum(String datatypeWithEnum) {
        this.datatypeWithEnum = datatypeWithEnum;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValueWithParam() {
        return defaultValueWithParam;
    }

    public void setDefaultValueWithParam(String defaultValueWithParam) {
        this.defaultValueWithParam = defaultValueWithParam;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnescapedDescription() {
        return unescapedDescription;
    }

    public void setUnescapedDescription(String unescapedDescription) {
        this.unescapedDescription = unescapedDescription;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    public boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    public void setExclusiveMinimum(boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    public boolean getIExclusiveMaximum() {
        return exclusiveMaximum;
    }

    public void setExclusiveMaximum(boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    public boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean getSecondaryParam() {
        return secondaryParam;
    }

    public void setSecondaryParam(boolean secondaryParam) {
        this.secondaryParam = secondaryParam;
    }

    public boolean getHasMoreNonReadOnly() {
        return hasMoreNonReadOnly;
    }

    public void setHasMoreNonReadOnly(boolean hasMoreNonReadOnly) {
        this.hasMoreNonReadOnly = hasMoreNonReadOnly;
    }

    public boolean getIsPrimitiveType() {
        return isPrimitiveType;
    }

    public void setPrimitiveType(boolean primitiveType) {
        isPrimitiveType = primitiveType;
    }

    public boolean getIsContainer() {
        return isContainer;
    }

    public void setContainer(boolean container) {
        isContainer = container;
    }

    public boolean getIsNotContainer() {
        return isNotContainer;
    }

    public void setNotContainer(boolean notContainer) {
        isNotContainer = notContainer;
    }

    public boolean getIsString() {
        return isString;
    }

    public void setString(boolean string) {
        isString = string;
    }

    public boolean getIsNumeric() {
        return isNumeric;
    }

    public void setNumeric(boolean numeric) {
        isNumeric = numeric;
    }

    public boolean getIsInteger() {
        return isInteger;
    }

    public void setInteger(boolean integer) {
        isInteger = integer;
    }

    public boolean getIsLong() {
        return isLong;
    }

    public void setLong(boolean aLong) {
        isLong = aLong;
    }

    public boolean getIsFloat() {
        return isFloat;
    }

    public void setFloat(boolean aFloat) {
        isFloat = aFloat;
    }

    public boolean getIsDouble() {
        return isDouble;
    }

    public void setDouble(boolean aDouble) {
        isDouble = aDouble;
    }

    public boolean isByteArray() {
        return isByteArray;
    }

    public void setByteArray(boolean byteArray) {
        isByteArray = byteArray;
    }

    public boolean isBinary() {
        return isBinary;
    }

    public void setBinary(boolean binary) {
        isBinary = binary;
    }

    public boolean getIsFile() {
        return isFile;
    }

    public void setFile(boolean file) {
        isFile = file;
    }

    public boolean getIsBoolean() {
        return isBoolean;
    }

    public void setBoolean(boolean aBoolean) {
        isBoolean = aBoolean;
    }

    public boolean getIsDate() {
        return isDate;
    }

    public void setDate(boolean date) {
        isDate = date;
    }

    public boolean getIsDateTime() {
        return isDateTime;
    }

    public void setDateTime(boolean dateTime) {
        isDateTime = dateTime;
    }

    public boolean getIsUuid() {
        return isUuid;
    }

    public void setUuid(boolean uuid) {
        isUuid = uuid;
    }

    public boolean getIsListContainer() {
        return isListContainer;
    }

    public void setListContainer(boolean listContainer) {
        isListContainer = listContainer;
    }

    public boolean getIsMapContainer() {
        return isMapContainer;
    }

    public void setMapContainer(boolean mapContainer) {
        isMapContainer = mapContainer;
    }

    public boolean getIsEnum() {
        return isEnum;
    }

    public void setEnum(boolean anEnum) {
        isEnum = anEnum;
    }

    public boolean getIsReadOnly() {
        return isReadOnly;
    }

    public void setReadOnly(boolean readOnly) {
        isReadOnly = readOnly;
    }

    public List<String> get_enum() {
        return _enum;
    }

    public void set_enum(List<String> _enum) {
        this._enum = _enum;
    }

    public Map<String, Object> getAllowableValues() {
        return allowableValues;
    }

    public void setAllowableValues(Map<String, Object> allowableValues) {
        this.allowableValues = allowableValues;
    }

    public CodegenProperty getItems() {
        return items;
    }

    public void setItems(CodegenProperty items) {
        this.items = items;
    }

    public Map<String, Object> getVendorExtensions() {
        return vendorExtensions;
    }

    public void setVendorExtensions(Map<String, Object> vendorExtensions) {
        this.vendorExtensions = vendorExtensions;
    }

    public boolean getHasValidation() {
        return hasValidation;
    }

    public void setHasValidation(boolean hasValidation) {
        this.hasValidation = hasValidation;
    }

    public boolean isInherited() {
        return isInherited;
    }

    public void setInherited(boolean inherited) {
        isInherited = inherited;
    }

    public String getNameInCamelCase() {
        return nameInCamelCase;
    }

    public void setNameInCamelCase(String nameInCamelCase) {
        this.nameInCamelCase = nameInCamelCase;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public Integer getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    public Integer getMinItems() {
        return minItems;
    }

    public void setMinItems(Integer minItems) {
        this.minItems = minItems;
    }

    public boolean getIsXmlAttribute() {
        return isXmlAttribute;
    }

    public void setXmlAttribute(boolean xmlAttribute) {
        isXmlAttribute = xmlAttribute;
    }

    public String getXmlPrefix() {
        return xmlPrefix;
    }

    public void setXmlPrefix(String xmlPrefix) {
        this.xmlPrefix = xmlPrefix;
    }

    public String getXmlName() {
        return xmlName;
    }

    public void setXmlName(String xmlName) {
        this.xmlName = xmlName;
    }

    public String getXmlNamespace() {
        return xmlNamespace;
    }

    public void setXmlNamespace(String xmlNamespace) {
        this.xmlNamespace = xmlNamespace;
    }

    public boolean getIsXmlWrapped() {
        return isXmlWrapped;
    }

    public void setXmlWrapped(boolean xmlWrapped) {
        isXmlWrapped = xmlWrapped;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", baseName, datatype);
    }


    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_enum == null) ? 0 : _enum.hashCode());
        result = prime * result + ((allowableValues == null) ? 0 : allowableValues.hashCode());
        result = prime * result + ((baseName == null) ? 0 : baseName.hashCode());
        result = prime * result + ((baseType == null) ? 0 : baseType.hashCode());
        result = prime * result + ((complexType == null) ? 0 : complexType.hashCode());
        result = prime * result + ((containerType == null) ? 0 : containerType.hashCode());
        result = prime * result + ((datatype == null) ? 0 : datatype.hashCode());
        result = prime * result + ((datatypeWithEnum == null) ? 0 : datatypeWithEnum.hashCode());
        result = prime * result + ((dataFormat == null) ? 0 : dataFormat.hashCode());
        result = prime * result + ((defaultValue == null) ? 0 : defaultValue.hashCode());
        result = prime * result + ((defaultValueWithParam == null) ? 0 : defaultValueWithParam.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((example == null) ? 0 : example.hashCode());
        result = prime * result + (exclusiveMaximum ? 13:31);
        result = prime * result + (exclusiveMinimum ? 13:31);
        result = prime * result + ((getter == null) ? 0 : getter.hashCode());
        result = prime * result + (hasMore  ? 13:31);
        result = prime * result + ((hasMoreNonReadOnly  ? 13:31));
        result = prime * result + ((isContainer  ? 13:31));
        result = prime * result + (isEnum ? 1231 : 1237);
        result = prime * result + ((isNotContainer ? 13:31));
        result = prime * result + ((isPrimitiveType  ? 13:31));
        result = prime * result + ((isReadOnly  ? 13:31));
        result = prime * result + ((items == null) ? 0 : items.hashCode());
        result = prime * result + ((jsonSchema == null) ? 0 : jsonSchema.hashCode());
        result = prime * result + ((max == null) ? 0 : max.hashCode());
        result = prime * result + ((maxLength == null) ? 0 : maxLength.hashCode());
        result = prime * result + ((maximum == null) ? 0 : maximum.hashCode());
        result = prime * result + ((min == null) ? 0 : min.hashCode());
        result = prime * result + ((minLength == null) ? 0 : minLength.hashCode());
        result = prime * result + ((minimum == null) ? 0 : minimum.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((pattern == null) ? 0 : pattern.hashCode());
        result = prime * result + ((required  ? 13:31));
        result = prime * result + ((secondaryParam ? 13:31));
        result = prime * result + ((setter == null) ? 0 : setter.hashCode());
        result = prime * result + ((unescapedDescription == null) ? 0 : unescapedDescription.hashCode());
        result = prime * result + ((vendorExtensions == null) ? 0 : vendorExtensions.hashCode());
        result = prime * result + ((hasValidation  ? 13:31));
        result = prime * result + ((isString  ? 13:31));
        result = prime * result + ((isNumeric ? 13:31));
        result = prime * result + ((isInteger ? 13:31));
        result = prime * result + ((isLong  ?13:31));
        result = prime * result + ((isNumber ? 13:31));
        result = prime * result + ((isFloat ? 13:31));
        result = prime * result + ((isDouble  ? 13:31));
        result = prime * result + ((isByteArray  ? 13:31));
        result = prime * result + ((isBinary  ? 13:31));
        result = prime * result + ((isFile  ? 13:31));
        result = prime * result + ((isBoolean  ? 13:31));
        result = prime * result + ((isDate  ? 13:31));
        result = prime * result + ((isDateTime ? 13:31));
        result = prime * result + ((isUuid ? 13:31));
        result = prime * result + ((isMapContainer ? 13:31));
        result = prime * result + ((isListContainer  ? 13:31));
        result = prime * result + Objects.hashCode(isInherited);
        result = prime * result + Objects.hashCode(nameInCamelCase);
        result = prime * result + Objects.hashCode(enumName);
        result = prime * result + ((maxItems == null) ? 0 : maxItems.hashCode());
        result = prime * result + ((minItems == null) ? 0 : minItems.hashCode());
        result = prime * result + ((isXmlAttribute  ? 13:31));
        result = prime * result + ((xmlPrefix == null) ? 0 : xmlPrefix.hashCode());
        result = prime * result + ((xmlName == null) ? 0 : xmlName.hashCode());
        result = prime * result + ((xmlNamespace == null) ? 0 : xmlNamespace.hashCode());
        result = prime * result + ((isXmlWrapped  ? 13:31));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CodegenProperty other = (CodegenProperty) obj;
        if ((this.baseName == null) ? (other.baseName != null) : !this.baseName.equals(other.baseName)) {
            return false;
        }
        if ((this.complexType == null) ? (other.complexType != null) : !this.complexType.equals(other.complexType)) {
            return false;
        }
        if ((this.getter == null) ? (other.getter != null) : !this.getter.equals(other.getter)) {
            return false;
        }
        if ((this.setter == null) ? (other.setter != null) : !this.setter.equals(other.setter)) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if ((this.title == null) ? (other.title != null) : !this.title.equals(other.title)) {
            return false;
        }
        if ((this.datatype == null) ? (other.datatype != null) : !this.datatype.equals(other.datatype)) {
            return false;
        }
        if ((this.datatypeWithEnum == null) ? (other.datatypeWithEnum != null) : !this.datatypeWithEnum.equals(other.datatypeWithEnum)) {
            return false;
        }
        if ((this.dataFormat == null) ? (other.dataFormat != null) : !this.dataFormat.equals(other.dataFormat)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.min == null) ? (other.min != null) : !this.min.equals(other.min)) {
            return false;
        }
        if ((this.max == null) ? (other.max != null) : !this.max.equals(other.max)) {
            return false;
        }
        if ((this.defaultValue == null) ? (other.defaultValue != null) : !this.defaultValue.equals(other.defaultValue)) {
            return false;
        }
        if ((this.baseType == null) ? (other.baseType != null) : !this.baseType.equals(other.baseType)) {
            return false;
        }
        if ((this.containerType == null) ? (other.containerType != null) : !this.containerType.equals(other.containerType)) {
            return false;
        }
        if (this.maxLength != other.maxLength && (this.maxLength == null || !this.maxLength.equals(other.maxLength))) {
            return false;
        }
        if (this.minLength != other.minLength && (this.minLength == null || !this.minLength.equals(other.minLength))) {
            return false;
        }
        if ((this.pattern == null) ? (other.pattern != null) : !this.pattern.equals(other.pattern)) {
            return false;
        }
        if ((this.example == null) ? (other.example != null) : !this.example.equals(other.example)) {
            return false;
        }
        if ((this.jsonSchema == null) ? (other.jsonSchema != null) : !this.jsonSchema.equals(other.jsonSchema)) {
            return false;
        }
        if (this.minimum != other.minimum && (this.minimum == null || !this.minimum.equals(other.minimum))) {
            return false;
        }
        if (this.maximum != other.maximum && (this.maximum == null || !this.maximum.equals(other.maximum))) {
            return false;
        }
        if (this.exclusiveMinimum != other.exclusiveMinimum) {
            return false;
        }
        if (this.exclusiveMaximum != other.exclusiveMaximum) {
            return false;
        }
        if (this.required != other.required) {
            return false;
        }
        if (this.secondaryParam != other.secondaryParam) {
            return false;
        }
        if (this.isPrimitiveType != other.isPrimitiveType) {
            return false;
        }
        if (this.isContainer != other.isContainer) {
            return false;
        }
        if (this.isNotContainer != other.isNotContainer) {
            return false;
        }
        if (this.isEnum != other.isEnum) {
            return false;
        }
        if (this.isReadOnly != other.isReadOnly) {
            return false;
        }
        if (this._enum != other._enum && (this._enum == null || !this._enum.equals(other._enum))) {
            return false;
        }
        if (this.allowableValues != other.allowableValues && (this.allowableValues == null || !this.allowableValues.equals(other.allowableValues))) {
            return false;
        }

        if (this.vendorExtensions != other.vendorExtensions && (this.vendorExtensions == null || !this.vendorExtensions.equals(other.vendorExtensions))) {
            return false;
        }

        if (this.hasValidation != other.hasValidation) {
            return false;
        }

        if (this.isString != other.isString) {
            return false;
        }

        if (this.isNumeric != other.isNumeric) {
            return false;
        }
        if (this.isInteger != other.isInteger) {
            return false;
        }
        if (this.isLong != other.isLong) {
            return false;
        }
        if (this.isNumber != other.isNumber) {
            return false;
        }
        if (this.isFloat != other.isFloat) {
            return false;
        }
        if (this.isDouble != other.isDouble) {
            return false;
        }
        if (this.isByteArray != other.isByteArray) {
            return false;
        }
        if (this.isBoolean != other.isBoolean) {
            return false;
        }
        if (this.isDate != other.isDate) {
            return false;
        }
        if (this.isDateTime != other.isDateTime) {
            return false;
        }
        if (this.isUuid != other.isUuid) {
            return false;
        }
        if (this.isBinary != other.isBinary) {
            return false;
        }
        if (this.isFile != other.isFile) {
            return false;
        }
        if (this.isListContainer != other.isListContainer) {
            return false;
        }
        if (this.isMapContainer != other.isMapContainer) {
            return false;
        }
        if (!Objects.equals(this.isInherited, other.isInherited)) {
            return false;
        }
        if (!Objects.equals(this.nameInCamelCase, other.nameInCamelCase)) {
            return false;
        }
        if (!Objects.equals(this.enumName, other.enumName)) {
            return false;
        }
        if (this.maxItems != other.maxItems && (this.maxItems == null || !this.maxItems.equals(other.maxItems))) {
            return false;
        }
        if (this.minItems != other.minItems && (this.minItems == null || !this.minItems.equals(other.minItems))) {
            return false;
        }
        if (!Objects.equals(this.isXmlAttribute, other.isXmlAttribute)) {
            return false;
        }
        if (!Objects.equals(this.xmlPrefix, other.xmlPrefix)) {
            return false;
        }
        if (!Objects.equals(this.xmlName, other.xmlName)) {
            return false;
        }
        if (!Objects.equals(this.xmlNamespace, other.xmlNamespace)) {
            return false;
        }
        if (!Objects.equals(this.isXmlWrapped, other.isXmlWrapped)) {
            return false;
        }
        return true;
    }

    @Override
    public CodegenProperty clone() {
        try {
            CodegenProperty cp = (CodegenProperty) super.clone();
            if (this._enum != null) {
                cp._enum = new ArrayList<String>(this._enum);
            }
            if (this.allowableValues != null) {
                cp.allowableValues = new HashMap<String, Object>(this.allowableValues);
            }
            if (this.items != null) {
                cp.items = this.items;
            }
            if(this.vendorExtensions != null){
                cp.vendorExtensions = new HashMap<String, Object>(this.vendorExtensions);
            }
            return cp;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }


}
