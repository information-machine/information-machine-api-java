/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MetaPaged 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5122202204641414797L;
    private String lastPage;
    private Integer maxNumberOfRequestsPerDay;
    private String nextPage;
    private Integer page;
    private Integer perPage;
    private Integer remainingNumberOfRequest;
    private Double timeInEpochSecondTillReset;
    private Integer totalNumberOfPages;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("last_page")
    public String getLastPage ( ) { 
        return this.lastPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("last_page")
    public void setLastPage (String value) { 
        this.lastPage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("max_number_of_requests_per_day")
    public Integer getMaxNumberOfRequestsPerDay ( ) { 
        return this.maxNumberOfRequestsPerDay;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("max_number_of_requests_per_day")
    public void setMaxNumberOfRequestsPerDay (Integer value) { 
        this.maxNumberOfRequestsPerDay = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("next_page")
    public String getNextPage ( ) { 
        return this.nextPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("next_page")
    public void setNextPage (String value) { 
        this.nextPage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("per_page")
    public Integer getPerPage ( ) { 
        return this.perPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("per_page")
    public void setPerPage (Integer value) { 
        this.perPage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("remaining_number_of_request")
    public Integer getRemainingNumberOfRequest ( ) { 
        return this.remainingNumberOfRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("remaining_number_of_request")
    public void setRemainingNumberOfRequest (Integer value) { 
        this.remainingNumberOfRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("time_in_epoch_second_till_reset")
    public Double getTimeInEpochSecondTillReset ( ) { 
        return this.timeInEpochSecondTillReset;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("time_in_epoch_second_till_reset")
    public void setTimeInEpochSecondTillReset (Double value) { 
        this.timeInEpochSecondTillReset = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("total_number_of_pages")
    public Integer getTotalNumberOfPages ( ) { 
        return this.totalNumberOfPages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("total_number_of_pages")
    public void setTotalNumberOfPages (Integer value) { 
        this.totalNumberOfPages = value;
    }
 
}
 