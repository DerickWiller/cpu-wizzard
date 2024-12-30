package cpuwizard.cpuwizard.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CpuRecomendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String processor;
    private String architecture;
    private String cacheInfo;
    private String frequency;
    private String justification;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getArchitecture() {
        return architecture;
    }
    public void setArchitecture(String architeture) {
        this.architecture = architeture;
    }
    public String getCacheInfo() {
        return cacheInfo;
    }
    public void setCacheInfo(String cacheInfo) {
        this.cacheInfo = cacheInfo;
    }
    public String getFrequency() {
        return frequency;
    }
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    public String getJustification() {
        return justification;
    }
    public void setJustification(String justification) {
        this.justification = justification;
    }

    
}
