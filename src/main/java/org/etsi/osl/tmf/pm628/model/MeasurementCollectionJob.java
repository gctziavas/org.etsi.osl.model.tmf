package org.etsi.osl.tmf.pm628.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;

import javax.annotation.Generated;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * MeasurementCollectionJob
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-15T07:30:16.936523289Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Entity(name = "PM628_MCJob")
public class MeasurementCollectionJob extends MeasurementJob implements PatchMeasurementCollectionJob200Response {

  @JsonProperty("outputFormat")
  private String outputFormat;

  @JsonProperty("reportingPeriod")
  private ReportingPeriod reportingPeriod;

  @Embedded
  @JsonProperty("jobCollectionFilter")
  @AttributeOverrides(
        {
            @AttributeOverride(name = "type", column = @Column(name = "jcf_type")),
            @AttributeOverride(name = "baseType", column = @Column(name = "jcf_base_type")),
            @AttributeOverride(name = "schemaLocation", column = @Column(name = "jcf_schema_location")),
//            @AttributeOverride(name = "mappings", column = @Column(name = "jcf_mappings"))
        }
  )
  private DataFilterMap jobCollectionFilter;

  @Embedded
  @JsonProperty("searchTaskFilter")
  @AttributeOverrides(
          {
                  @AttributeOverride(name = "type", column = @Column(name = "stf_type")),
                  @AttributeOverride(name = "baseType", column = @Column(name = "stf_base_type")),
                  @AttributeOverride(name = "schemaLocation", column = @Column(name = "stf_schema_location")),
//                  @AttributeOverride(name = "mappings", column = @Column(name = "stf_mappings"))
          }
  )
  private DataFilterMap searchTaskFilter;

  @JsonProperty("jobOnDemand")
  private Boolean jobOnDemand = false;

  public MeasurementCollectionJob() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeasurementCollectionJob(String atType) {
    super(atType);
  }

  public MeasurementCollectionJob outputFormat(String outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Get outputFormat
   * @return outputFormat
  */
  
  @Schema(name = "outputFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(String outputFormat) {
    this.outputFormat = outputFormat;
  }

  public MeasurementCollectionJob reportingPeriod(ReportingPeriod reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
    return this;
  }

  /**
   * Get reportingPeriod
   * @return reportingPeriod
  */
  @Valid 
  @Schema(name = "reportingPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ReportingPeriod getReportingPeriod() {
    return reportingPeriod;
  }

  public void setReportingPeriod(ReportingPeriod reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
  }

  public MeasurementCollectionJob jobCollectionFilter(DataFilterMap jobCollectionFilter) {
    this.jobCollectionFilter = jobCollectionFilter;
    return this;
  }

  /**
   * Get jobCollectionFilter
   * @return jobCollectionFilter
  */
  @Valid 
  @Schema(name = "jobCollectionFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public DataFilterMap getJobCollectionFilter() {
    return jobCollectionFilter;
  }

  public void setJobCollectionFilter(DataFilterMap jobCollectionFilter) {
    this.jobCollectionFilter = jobCollectionFilter;
  }

  public MeasurementCollectionJob searchTaskFilter(DataFilterMap searchTaskFilter) {
    this.searchTaskFilter = searchTaskFilter;
    return this;
  }

  /**
   * Get searchTaskFilter
   * @return searchTaskFilter
  */
  @Valid 
  @Schema(name = "searchTaskFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public DataFilterMap getSearchTaskFilter() {
    return searchTaskFilter;
  }

  public void setSearchTaskFilter(DataFilterMap searchTaskFilter) {
    this.searchTaskFilter = searchTaskFilter;
  }

  public MeasurementCollectionJob jobOnDemand(Boolean jobOnDemand) {
    this.jobOnDemand = jobOnDemand;
    return this;
  }

  /**
   * True if the job is a single job to be executed immediately in which case the reportingPeriod and scheduleDefinition would not be applicable, false otherwise
   * @return jobOnDemand
  */
  
  @Schema(name = "jobOnDemand", description = "True if the job is a single job to be executed immediately in which case the reportingPeriod and scheduleDefinition would not be applicable, false otherwise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getJobOnDemand() {
    return jobOnDemand;
  }

  public void setJobOnDemand(Boolean jobOnDemand) {
    this.jobOnDemand = jobOnDemand;
  }


  public MeasurementCollectionJob consumingApplicationId(String consumingApplicationId) {
    super.consumingApplicationId(consumingApplicationId);
    return this;
  }

  public MeasurementCollectionJob producingApplicationId(String producingApplicationId) {
    super.producingApplicationId(producingApplicationId);
    return this;
  }

  public MeasurementCollectionJob granularity(Granularity granularity) {
    super.granularity(granularity);
    return this;
  }

  public MeasurementCollectionJob performanceIndicatorGroupSpecification(List<PerformanceIndicatorGroupSpecification> performanceIndicatorGroupSpecification) {
    super.performanceIndicatorGroupSpecification(performanceIndicatorGroupSpecification);
    return this;
  }

  public MeasurementCollectionJob addPerformanceIndicatorGroupSpecificationItem(PerformanceIndicatorGroupSpecification performanceIndicatorGroupSpecificationItem) {
    super.addPerformanceIndicatorGroupSpecificationItem(performanceIndicatorGroupSpecificationItem);
    return this;
  }

  public MeasurementCollectionJob performanceIndicatorSpecification(List<@Valid PerformanceIndicatorSpecificationRefOrValue> performanceIndicatorSpecification) {
    super.performanceIndicatorSpecification(performanceIndicatorSpecification);
    return this;
  }

  public MeasurementCollectionJob addPerformanceIndicatorSpecificationItem(PerformanceIndicatorSpecificationRefOrValue performanceIndicatorSpecificationItem) {
    super.addPerformanceIndicatorSpecificationItem(performanceIndicatorSpecificationItem);
    return this;
  }

  public MeasurementCollectionJob trackingRecord(List<TrackingRecord> trackingRecord) {
    super.trackingRecord(trackingRecord);
    return this;
  }

  public MeasurementCollectionJob addTrackingRecordItem(TrackingRecord trackingRecordItem) {
    super.addTrackingRecordItem(trackingRecordItem);
    return this;
  }

  public MeasurementCollectionJob monitoredInstancesCriteria(MonitoredInstancesCriteria monitoredInstancesCriteria) {
    super.monitoredInstancesCriteria(monitoredInstancesCriteria);
    return this;
  }

  public MeasurementCollectionJob monitoredClassCriteria(MonitoredClassCriteria monitoredClassCriteria) {
    super.monitoredClassCriteria(monitoredClassCriteria);
    return this;
  }

  public MeasurementCollectionJob adminState(AdministrativeState adminState) {
    super.adminState(adminState);
    return this;
  }

  public MeasurementCollectionJob creationTime(OffsetDateTime creationTime) {
    super.creationTime(creationTime);
    return this;
  }

  public MeasurementCollectionJob executionState(ExecutionStateType executionState) {
    super.executionState(executionState);
    return this;
  }

  public MeasurementCollectionJob fileTransferData(List<FileTransferData> fileTransferData) {
    super.fileTransferData(fileTransferData);
    return this;
  }

  public MeasurementCollectionJob addFileTransferDataItem(FileTransferData fileTransferDataItem) {
    super.addFileTransferDataItem(fileTransferDataItem);
    return this;
  }

  public MeasurementCollectionJob dataAccessEndpoint(List<DataAccessEndpoint> dataAccessEndpoint) {
    super.dataAccessEndpoint(dataAccessEndpoint);
    return this;
  }

  public MeasurementCollectionJob addDataAccessEndpointItem(DataAccessEndpoint dataAccessEndpointItem) {
    super.addDataAccessEndpointItem(dataAccessEndpointItem);
    return this;
  }

  public MeasurementCollectionJob jobId(String jobId) {
    super.jobId(jobId);
    return this;
  }

  public MeasurementCollectionJob jobPriority(Integer jobPriority) {
    super.jobPriority(jobPriority);
    return this;
  }

  public MeasurementCollectionJob lastModifiedTime(OffsetDateTime lastModifiedTime) {
    super.lastModifiedTime(lastModifiedTime);
    return this;
  }

  public MeasurementCollectionJob scheduleDefinition(List<ScheduleDefinition> scheduleDefinition) {
    super.scheduleDefinition(scheduleDefinition);
    return this;
  }

  public MeasurementCollectionJob addScheduleDefinitionItem(ScheduleDefinition scheduleDefinitionItem) {
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
    MeasurementCollectionJob measurementCollectionJob = (MeasurementCollectionJob) o;
    return Objects.equals(this.outputFormat, measurementCollectionJob.outputFormat) &&
        Objects.equals(this.reportingPeriod, measurementCollectionJob.reportingPeriod) &&
        Objects.equals(this.jobCollectionFilter, measurementCollectionJob.jobCollectionFilter) &&
        Objects.equals(this.searchTaskFilter, measurementCollectionJob.searchTaskFilter) &&
        Objects.equals(this.jobOnDemand, measurementCollectionJob.jobOnDemand) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputFormat, reportingPeriod, jobCollectionFilter, searchTaskFilter, jobOnDemand, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollectionJob {\n");
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

