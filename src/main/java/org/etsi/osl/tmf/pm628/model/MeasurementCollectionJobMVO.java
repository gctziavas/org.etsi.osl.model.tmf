package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.util.List;
import java.util.Objects;

/**
 * MeasurementCollectionJobMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MeasurementCollectionJobMVO extends MeasurementJobMVO {

  @JsonProperty("outputFormat")
  private String outputFormat;

  @JsonProperty("reportingPeriod")
  private ReportingPeriod reportingPeriod;

  @JsonProperty("jobCollectionFilter")
  private DataFilterMapMVO jobCollectionFilter;

  @JsonProperty("searchTaskFilter")
  private DataFilterMapMVO searchTaskFilter;

  @JsonProperty("jobOnDemand")
  private Boolean jobOnDemand = false;

  public MeasurementCollectionJobMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeasurementCollectionJobMVO(String atType) {
    super(atType);
  }

  public MeasurementCollectionJobMVO outputFormat(String outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Get outputFormat
   * @return outputFormat
  */
  
  @Schema(name = "outputFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputFormat")
  public String getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(String outputFormat) {
    this.outputFormat = outputFormat;
  }

  public MeasurementCollectionJobMVO reportingPeriod(ReportingPeriod reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
    return this;
  }

  /**
   * Get reportingPeriod
   * @return reportingPeriod
  */
  @Valid 
  @Schema(name = "reportingPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportingPeriod")
  public ReportingPeriod getReportingPeriod() {
    return reportingPeriod;
  }

  public void setReportingPeriod(ReportingPeriod reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
  }

  public MeasurementCollectionJobMVO jobCollectionFilter(DataFilterMapMVO jobCollectionFilter) {
    this.jobCollectionFilter = jobCollectionFilter;
    return this;
  }

  /**
   * Get jobCollectionFilter
   * @return jobCollectionFilter
  */
  @Valid 
  @Schema(name = "jobCollectionFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobCollectionFilter")
  public DataFilterMapMVO getJobCollectionFilter() {
    return jobCollectionFilter;
  }

  public void setJobCollectionFilter(DataFilterMapMVO jobCollectionFilter) {
    this.jobCollectionFilter = jobCollectionFilter;
  }

  public MeasurementCollectionJobMVO searchTaskFilter(DataFilterMapMVO searchTaskFilter) {
    this.searchTaskFilter = searchTaskFilter;
    return this;
  }

  /**
   * Get searchTaskFilter
   * @return searchTaskFilter
  */
  @Valid 
  @Schema(name = "searchTaskFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchTaskFilter")
  public DataFilterMapMVO getSearchTaskFilter() {
    return searchTaskFilter;
  }

  public void setSearchTaskFilter(DataFilterMapMVO searchTaskFilter) {
    this.searchTaskFilter = searchTaskFilter;
  }

  public MeasurementCollectionJobMVO jobOnDemand(Boolean jobOnDemand) {
    this.jobOnDemand = jobOnDemand;
    return this;
  }

  /**
   * True if the job is a single job to be executed immediately in which case the reportingPeriod and scheduleDefinition would not be applicable, false otherwise
   * @return jobOnDemand
  */
  
  @Schema(name = "jobOnDemand", description = "True if the job is a single job to be executed immediately in which case the reportingPeriod and scheduleDefinition would not be applicable, false otherwise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobOnDemand")
  public Boolean getJobOnDemand() {
    return jobOnDemand;
  }

  public void setJobOnDemand(Boolean jobOnDemand) {
    this.jobOnDemand = jobOnDemand;
  }


  public MeasurementCollectionJobMVO consumingApplicationId(String consumingApplicationId) {
    super.consumingApplicationId(consumingApplicationId);
    return this;
  }

  public MeasurementCollectionJobMVO producingApplicationId(String producingApplicationId) {
    super.producingApplicationId(producingApplicationId);
    return this;
  }

  public MeasurementCollectionJobMVO granularity(Granularity granularity) {
    super.granularity(granularity);
    return this;
  }

  public MeasurementCollectionJobMVO performanceIndicatorGroupSpecification(List<PerformanceIndicatorGroupSpecificationMVO> performanceIndicatorGroupSpecification) {
    super.performanceIndicatorGroupSpecification(performanceIndicatorGroupSpecification);
    return this;
  }

  public MeasurementCollectionJobMVO addPerformanceIndicatorGroupSpecificationItem(PerformanceIndicatorGroupSpecificationMVO performanceIndicatorGroupSpecificationItem) {
    super.addPerformanceIndicatorGroupSpecificationItem(performanceIndicatorGroupSpecificationItem);
    return this;
  }

  public MeasurementCollectionJobMVO performanceIndicatorSpecification(List<@Valid PerformanceIndicatorSpecificationRefOrValueMVO> performanceIndicatorSpecification) {
    super.performanceIndicatorSpecification(performanceIndicatorSpecification);
    return this;
  }

  public MeasurementCollectionJobMVO addPerformanceIndicatorSpecificationItem(PerformanceIndicatorSpecificationRefOrValueMVO performanceIndicatorSpecificationItem) {
    super.addPerformanceIndicatorSpecificationItem(performanceIndicatorSpecificationItem);
    return this;
  }

  public MeasurementCollectionJobMVO trackingRecord(List<TrackingRecordMVO> trackingRecord) {
    super.trackingRecord(trackingRecord);
    return this;
  }

  public MeasurementCollectionJobMVO addTrackingRecordItem(TrackingRecordMVO trackingRecordItem) {
    super.addTrackingRecordItem(trackingRecordItem);
    return this;
  }

  public MeasurementCollectionJobMVO fileTransferData(List<FileTransferDataMVO> fileTransferData) {
    super.fileTransferData(fileTransferData);
    return this;
  }

  public MeasurementCollectionJobMVO addFileTransferDataItem(FileTransferDataMVO fileTransferDataItem) {
    super.addFileTransferDataItem(fileTransferDataItem);
    return this;
  }

  public MeasurementCollectionJobMVO dataAccessEndpoint(List<DataAccessEndpointMVO> dataAccessEndpoint) {
    super.dataAccessEndpoint(dataAccessEndpoint);
    return this;
  }

  public MeasurementCollectionJobMVO addDataAccessEndpointItem(DataAccessEndpointMVO dataAccessEndpointItem) {
    super.addDataAccessEndpointItem(dataAccessEndpointItem);
    return this;
  }

  public MeasurementCollectionJobMVO scheduleDefinition(List<ScheduleDefinitionMVO> scheduleDefinition) {
    super.scheduleDefinition(scheduleDefinition);
    return this;
  }

  public MeasurementCollectionJobMVO addScheduleDefinitionItem(ScheduleDefinitionMVO scheduleDefinitionItem) {
    super.addScheduleDefinitionItem(scheduleDefinitionItem);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementCollectionJobMVO measurementCollectionJobMVO = (MeasurementCollectionJobMVO) o;
    return Objects.equals(this.outputFormat, measurementCollectionJobMVO.outputFormat) &&
        Objects.equals(this.reportingPeriod, measurementCollectionJobMVO.reportingPeriod) &&
        Objects.equals(this.jobCollectionFilter, measurementCollectionJobMVO.jobCollectionFilter) &&
        Objects.equals(this.searchTaskFilter, measurementCollectionJobMVO.searchTaskFilter) &&
        Objects.equals(this.jobOnDemand, measurementCollectionJobMVO.jobOnDemand) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputFormat, reportingPeriod, jobCollectionFilter, searchTaskFilter, jobOnDemand, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollectionJobMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    reportingPeriod: ").append(toIndentedString(reportingPeriod)).append("\n");
    sb.append("    jobCollectionFilter: ").append(toIndentedString(jobCollectionFilter)).append("\n");
    sb.append("    searchTaskFilter: ").append(toIndentedString(searchTaskFilter)).append("\n");
    sb.append("    jobOnDemand: ").append(toIndentedString(jobOnDemand)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

