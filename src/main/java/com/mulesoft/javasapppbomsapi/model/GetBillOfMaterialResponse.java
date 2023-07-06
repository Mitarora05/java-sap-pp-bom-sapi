package com.mulesoft.javasapppbomsapi.model;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class GetBillOfMaterialResponse {
    private String CreatedByUser;
    private String BOMHeaderText;
    private Boolean IsALE;
    private Boolean IsMarkedForDeletion;
    private String BOMUsagePriority;
    private String SelectedBillOfMaterialVersion;
    private String BillOfMaterialVariantUsage;
    private Boolean IsVersionBillOfMaterial;
    private String BillOfMaterial;
    private String Plant;
    private String BOMHeaderBaseUnit;
    private Boolean IsConfiguredMaterial;
    private String BillOfMaterialAuthsnGrp;
    private String ChgToEngineeringChgDocument;
    private String BillOfMaterialVariant;
    private String BOMVersionStatus;
    private String BOMIsToBeDeleted;
    private String BOMGroup;
    private String HeaderValidityStartDate;
    private String BillOfMaterialHeaderUUID;
    private String BillOfMaterialVersion;
    private Boolean IsLatestBOMVersion;
    private String EngineeringChangeDocForEdit;
    private String LaboratoryOrDesignOffice;
    private String Material;
    private String LastChangedByUser;
    private Boolean DocumentIsCreatedByCAD;
    private Boolean IsMultipleBOMAlt;
    private String BillOfMaterialStatus;
    private String RecordCreationDate;
    private String LastChangeDate;
    private String BOMTechnicalType;
    private String HeaderValidityEndDate;
    private Integer BOMHeaderQuantityInBaseUnit;
    private String BOMHeaderInternalChangeCount;
    private String BOMAlternativeText;
    private String BillOfMaterialCategory;
    private String EngineeringChangeDocument;
}