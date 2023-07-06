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
public class PostBillOfMaterialRequest {
    private String BillOfMaterialHeaderUUID;
    private String BillOfMaterialVariantUsage;
    private String BillOfMaterialCategory;
    private String BillOfMaterial;
    private String BillOfMaterialVariant;
    private String Material;
    private String Plant;
    private Boolean IsMultipleBOMAlt;
    private String BOMHeaderInternalChangeCount;
    private String BOMUsagePriority;
    private String BillOfMaterialAuthsnGrp;
    private String BillOfMaterialVersion;
    private String BOMVersionStatus;
    private Boolean IsVersionBillOfMaterial;
    private Boolean IsLatestBOMVersion;
    private Boolean IsConfiguredMaterial;
    private String BOMTechnicalType;
    private String BOMGroup;
    private String BOMHeaderText;
    private String BOMAlternativeText;
    private String BillOfMaterialStatus;
    private String HeaderValidityStartDate;
    private String HeaderValidityEndDate;
    private String EngineeringChangeDocument;
    private String EngineeringChangeDocForEdit;
    private String ChgToEngineeringChgDocument;
    private Boolean IsMarkedForDeletion;
    private Boolean IsALE;
    private String BOMHeaderBaseUnit;
    private String BOMHeaderQuantityInBaseUnit;
    private String RecordCreationDate;
    private String LastChangeDate;
    private String CreatedByUser;
    private String LastChangedByUser;
    private String BOMIsToBeDeleted;
    private Boolean DocumentIsCreatedByCAD;
    private String LaboratoryOrDesignOffice;
    private String SelectedBillOfMaterialVersion;
}