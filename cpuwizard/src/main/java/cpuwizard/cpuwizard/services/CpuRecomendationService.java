package cpuwizard.cpuwizard.services;

import org.springframework.stereotype.Service;

import cpuwizard.cpuwizard.dto.CpuCriteriaDto;
import cpuwizard.cpuwizard.model.CpuRecomendation;

@Service
public class CpuRecomendationService {

    public CpuRecomendation GetRecomendation(CpuCriteriaDto criteria) {
        CpuRecomendation recommendation = new CpuRecomendation();

        String applicationType = criteria.getApplicationType().toLowerCase();
        String performance = criteria.getPerformance().toLowerCase();
        String energyConsumption = criteria.getEnergyConsumption().toLowerCase();
        String cost = criteria.getCost().toLowerCase();

        // Verificando tipo de aplicação
        if (applicationType.equals("iot")) {
            // Combinações específicas para IoT
            if (performance.equals("fast") && energyConsumption.equals("medium") && cost.equals("low")) {
                recommendation.setProcessor("Intel Core i3-10100T");
                recommendation.setArchitecture("CISC");
                recommendation.setCacheInfo("L1: 64KB, L2: 256KB, L3: 6MB");
                recommendation.setFrequency("3.0GHz (Boost até 3.8GHz)");
                recommendation.setJustification("Bom equilíbrio para dispositivos IoT.");
            } else if (performance.equals("moderate") && energyConsumption.equals("low") && cost.equals("low")) {
                recommendation.setProcessor("Intel Atom x6200FE");
                recommendation.setArchitecture("RISC");
                recommendation.setCacheInfo("L1: 24KB, L2: 1MB");
                recommendation.setFrequency("1.3GHz");
                recommendation.setJustification("Ideal para IoT com baixo consumo de energia.");
            } else if (performance.equals("slow") && energyConsumption.equals("low") && cost.equals("low")) {
                recommendation.setProcessor("ARM Cortex-A53");
                recommendation.setArchitecture("RISC");
                recommendation.setCacheInfo("L1: 32KB, L2: 1MB");
                recommendation.setFrequency("1.2GHz");
                recommendation.setJustification("Ideal para dispositivos IoT básicos com baixo custo e consumo de energia.");
            }
        } else if (applicationType.equals("games")) {
            // Combinações específicas para Jogos
            if (performance.equals("fast") && energyConsumption.equals("medium") && cost.equals("medium")) {
                recommendation.setProcessor("AMD Ryzen 7 5800X");
                recommendation.setArchitecture("CISC");
                recommendation.setCacheInfo("L1: 64KB, L2: 512KB, L3: 32MB");
                recommendation.setFrequency("3.8GHz (Boost até 4.7GHz)");
                recommendation.setJustification("Excelente para jogos de alto desempenho.");
            } else if (performance.equals("moderate") && energyConsumption.equals("low") && cost.equals("low")) {
                recommendation.setProcessor("Intel Core i5-10400F");
                recommendation.setArchitecture("CISC");
                recommendation.setCacheInfo("L1: 64KB, L2: 256KB, L3: 12MB");
                recommendation.setFrequency("2.9GHz (Boost até 4.3GHz)");
                recommendation.setJustification("Bom para jogos moderados com baixo custo.");
            }
        } else if (applicationType.equals("ai")) {
            // Combinações específicas para IA
            if (performance.equals("fast") && energyConsumption.equals("high") && cost.equals("high")) {
                recommendation.setProcessor("Intel Xeon W-3275");
                recommendation.setArchitecture("CISC");
                recommendation.setCacheInfo("L1: 64KB, L2: 1MB, L3: 38.5MB");
                recommendation.setFrequency("2.5GHz (Boost até 4.6GHz)");
                recommendation.setJustification("Ideal para cargas intensivas de IA.");
            } else if (performance.equals("moderate") && energyConsumption.equals("medium") && cost.equals("medium")) {
                recommendation.setProcessor("AMD Ryzen 5 5600X");
                recommendation.setArchitecture("CISC");
                recommendation.setCacheInfo("L1: 64KB, L2: 512KB, L3: 32MB");
                recommendation.setFrequency("3.7GHz (Boost até 4.6GHz)");
                recommendation.setJustification("Balanceado para tarefas de IA.");
            }
        } else if (applicationType.equals("video editing")) {
            // Combinações específicas para Edição de Vídeo
            if (performance.equals("fast") && cost.equals("high")) {
                recommendation.setProcessor("AMD Ryzen 9 7950X");
                recommendation.setArchitecture("CISC");
                recommendation.setCacheInfo("L1: 64KB, L2: 1MB, L3: 64MB");
                recommendation.setFrequency("4.5GHz (Boost até 5.7GHz)");
                recommendation.setJustification("Excelente para edição de vídeos.");
            } else if (performance.equals("moderate") && cost.equals("medium")) {
                recommendation.setProcessor("Intel Core i7-11700");
                recommendation.setArchitecture("CISC");
                recommendation.setCacheInfo("L1: 64KB, L2: 512KB, L3: 16MB");
                recommendation.setFrequency("2.5GHz (Boost até 4.9GHz)");
                recommendation.setJustification("Bom equilíbrio para edição de vídeos.");
            }
        }

        // Fallback para casos onde não se encaixou em nenhuma das condições
        if (recommendation.getProcessor() == null) {
            recommendation.setProcessor("Intel Core i5-13400");
            recommendation.setArchitecture("CISC");
            recommendation.setCacheInfo("L1: 64KB, L2: 1.25MB, L3: 20MB");
            recommendation.setFrequency("2.5GHz (Boost até 4.6GHz)");
            recommendation.setJustification("Recomendação padrão.");
        }

        return recommendation;
    }

}
