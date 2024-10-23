package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * MeasurementCollectionJobFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MeasurementCollectionJobFVO extends MeasurementJobFVO {

  @JsonProperty("outputFormat")
  private String outputFormat;

  @JsonProperty("reportingPeriod")
  private ReportingPeriod reportingPeriod;

  @JsonProperty("jobCollectionFilter")
  private DataFilterMapFVO jobCollectionFilter;

  @JsonProperty("searchTaskFilter")
  private DataFilterMapFVO searchTaskFilter;

  @JsonProperty("jobOnDemand")
  private Boolean jobOnDemand = false;

  public MeasurementCollectionJobFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeasurementCollectionJobFVO(String atType, String consumingApplicationId, String producingApplicationId, List<@Valid PerformanceIndicatorSpecificationRefOrValueFVO> performanceIndicatorSpecification) {
    super(consumingApplicationId, producingApplicationId, performanceIndicatorSpecification, atType);
  }

  public MeasurementCollectionJobFVO outputFormat(String outputFormat) {
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

  public MeasurementCollectionJobFVO reportingPeriod(ReportingPeriod reportingPeriod) {
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

  public MeasurementCollectionJobFVO jobCollectionFilter(DataFilterMapFVO jobCollectionFilter) {
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
  public DataFilterMapFVO getJobCollectionFilter() {
    return jobCollectionFilter;
  }

  public void setJobCollectionFilter(DataFilterMapFVO jobCollectionFilter) {
    this.jobCollectionFilter = jobCollectionFilter;
  }

  public MeasurementCollectionJobFVO searchTaskFilter(DataFilterMapFVO searchTaskFilter) {
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
  public DataFilterMapFVO getSearchTaskFilter() {
    return searchTaskFilter;
  }

  public void setSearchTaskFilter(DataFilterMapFVO searchTaskFilter) {
    this.searchTaskFilter = searchTaskFilter;
  }

  public MeasurementCollectionJobFVO jobOnDemand(Boolean jobOnDemand) {
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


  public MeasurementCollectionJobFVO consumingApplicationId(String consumingApplicationId) {
    super.consumingApplicationId(consumingApplicationId);
    return this;
  }

  public MeasurementCollectionJobFVO producingApplicationId(String producingApplicationId) {
    super.producingApplicationId(producingApplicationId);
    return this;
  }

  public MeasurementCollectionJobFVO granularity(Granularity granularity) {
    super.granularity(granularity);
    return this;
  }

  public MeasurementCollectionJobFVO performanceIndicatorGroupSpecification(List<PerformanceIndicatorGroupSpecificationFVO> performanceIndicatorGroupSpecification) {
    super.performanceIndicatorGroupSpecification(performanceIndicatorGroupSpecification);
    return this;
  }

  public MeasurementCollectionJobFVO addPerformanceIndicatorGroupSpecificationItem(PerformanceIndicatorGroupSpecificationFVO performanceIndicatorGroupSpecificationItem) {
    super.addPerformanceIndicatorGroupSpecificationItem(performanceIndicatorGroupSpecificationItem);
    return this;
  }

  public MeasurementCollectionJobFVO performanceIndicatorSpecification(List<@Valid PerformanceIndicatorSpecificationRefOrValueFVO> performanceIndicatorSpecification) {
    super.performanceIndicatorSpecification(performanceIndicatorSpecification);
    return this;
  }

  public MeasurementCollectionJobFVO addPerformanceIndicatorSpecificationItem(PerformanceIndicatorSpecificationRefOrValueFVO performanceIndicatorSpecificationItem) {
    super.addPerformanceIndicatorSpecificationItem(performanceIndicatorSpecificationItem);
    return this;
  }

  public MeasurementCollectionJobFVO trackingRecord(List<TrackingRecordFVO> trackingRecord) {
    super.trackingRecord(trackingRecord);
    return this;
  }

  public MeasurementCollectionJobFVO addTrackingRecordItem(TrackingRecordFVO trackingRecordItem) {
    super.addTrackingRecordItem(trackingRecordItem);
    return this;
  }

  public MeasurementCollectionJobFVO monitoredInstancesCriteria(MonitoredInstancesCriteriaFVO monitoredInstancesCriteria) {
    super.monitoredInstancesCriteria(monitoredInstancesCriteria);
    return this;
  }

  public MeasurementCollectionJobFVO monitoredClassCriteria(MonitoredClassCriteriaFVO monitoredClassCriteria) {
    super.monitoredClassCriteria(monitoredClassCriteria);
    return this;
  }

  public MeasurementCollectionJobFVO adminState(AdministrativeState adminState) {
    super.adminState(adminState);
    return this;
  }

  public MeasurementCollectionJobFVO creationTime(OffsetDateTime creationTime) {
    super.creationTime(creationTime);
    return this;
  }

  public MeasurementCollectionJobFVO executionState(ExecutionStateType executionState) {
    super.executionState(executionState);
    return this;
  }

  public MeasurementCollectionJobFVO fileTransferData(List<FileTransferDataFVO> fileTransferData) {
    super.fileTransferData(fileTransferData);
    return this;
  }

  public MeasurementCollectionJobFVO addFileTransferDataItem(FileTransferDataFVO fileTransferDataItem) {
    super.addFileTransferDataItem(fileTransferDataItem);
    return this;
  }

  public MeasurementCollectionJobFVO dataAccessEndpoint(List<DataAccessEndpointFVO> dataAccessEndpoint) {
    super.dataAccessEndpoint(dataAccessEndpoint);
    return this;
  }

  public MeasurementCollectionJobFVO addDataAccessEndpointItem(DataAccessEndpointFVO dataAccessEndpointItem) {
    super.addDataAccessEndpointItem(dataAccessEndpointItem);
    return this;
  }

  public MeasurementCollectionJobFVO jobId(String jobId) {
    super.jobId(jobId);
    return this;
  }

  public MeasurementCollectionJobFVO jobPriority(Integer jobPriority) {
    super.jobPriority(jobPriority);
    return this;
  }

  public MeasurementCollectionJobFVO lastModifiedTime(OffsetDateTime lastModifiedTime) {
    super.lastModifiedTime(lastModifiedTime);
    return this;
  }

  public MeasurementCollectionJobFVO scheduleDefinition(List<ScheduleDefinitionFVO> scheduleDefinition) {
    super.scheduleDefinition(scheduleDefinition);
    return this;
  }

  public MeasurementCollectionJobFVO addScheduleDefinitionItem(ScheduleDefinitionFVO scheduleDefinitionItem) {
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
    MeasurementCollectionJobFVO measurementCollectionJobFVO = (MeasurementCollectionJobFVO) o;
    return Objects.equals(this.outputFormat, measurementCollectionJobFVO.outputFormat) &&
        Objects.equals(this.reportingPeriod, measurementCollectionJobFVO.reportingPeriod) &&
        Objects.equals(this.jobCollectionFilter, measurementCollectionJobFVO.jobCollectionFilter) &&
        Objects.equals(this.searchTaskFilter, measurementCollectionJobFVO.searchTaskFilter) &&
        Objects.equals(this.jobOnDemand, measurementCollectionJobFVO.jobOnDemand) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputFormat, reportingPeriod, jobCollectionFilter, searchTaskFilter, jobOnDemand, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollectionJobFVO {\n");
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

