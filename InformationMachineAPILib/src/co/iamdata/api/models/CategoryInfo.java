/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CategoryInfo 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5421602015820180426L;
    private Integer id;
    private String name;
    private Integer parentId;
    private Boolean grocery;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public Integer getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (Integer value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("parent_id")
    public Integer getParentId ( ) { 
        return this.parentId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("parent_id")
    public void setParentId (Integer value) { 
        this.parentId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("grocery")
    public Boolean getGrocery ( ) { 
        return this.grocery;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("grocery")
    public void setGrocery (Boolean value) { 
        this.grocery = value;
    }
 
}
 