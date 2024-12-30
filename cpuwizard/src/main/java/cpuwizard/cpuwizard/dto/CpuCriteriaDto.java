package cpuwizard.cpuwizard.dto;

public class CpuCriteriaDto {

    private String energyConsumption;
    private String performance;
    private String cost;
    private String applicationType;

    
    public String getEnergyConsumption() {
        return energyConsumption;
    }
    public void setEnergyConsumption(String energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
    public String getPerformance() {
        return performance;
    }
    public void setPerformance(String performance) {
        this.performance = performance;
    }
    public String getCost() {
        return cost;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }
    public String getApplicationType() {
        return applicationType;
    }
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    

}
