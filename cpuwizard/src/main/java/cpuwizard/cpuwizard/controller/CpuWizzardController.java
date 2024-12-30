package cpuwizard.cpuwizard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cpuwizard.cpuwizard.dto.CpuCriteriaDto;
import cpuwizard.cpuwizard.model.CpuRecomendation;
import cpuwizard.cpuwizard.services.CpuRecomendationService;

@RestController
public class CpuWizzardController {

    private final CpuRecomendationService recomendationService;

    public CpuWizzardController(CpuRecomendationService recomendationService){
        this.recomendationService = recomendationService;
    }

    @GetMapping("/hello")
    public String homeMensage(){
        return "Welcome To Cpu-Wizzard";
    }

    @CrossOrigin(origins = "http://127.0.0.1:4200")
    @PostMapping("/recommend")
    public CpuRecomendation recomendation(@RequestBody CpuCriteriaDto criteria){
        return recomendationService.GetRecomendation(criteria);
    }
    
    @CrossOrigin(origins = "http://127.0.0.1:4200")
    @GetMapping("/saiba-mais")
    public String getRecommendationText() {
        return "{" +
                "  \"message\": \"Recomendação de CPU:\\n\\n" +
                "- Consumo de Energia: \\n" +
                "  -Low: CPUs com baixo consumo de energia são mais eficientes e indicadas para tarefas simples, como navegação na web e uso de aplicativos leves. Elas ajudam a reduzir os custos com eletricidade e são ideais para dispositivos que precisam de maior autonomia de bateria.\\n" +
                "  -Medium: Oferecem um equilíbrio entre desempenho e consumo, sendo uma boa opção para tarefas do dia a dia, como navegação, edição de documentos e reprodução de vídeos, sem sobrecarregar o sistema ou consumir muita energia.\\n" +
                "  -High: CPUs de alto consumo de energia são projetadas para tarefas pesadas e intensivas, como jogos de alto desempenho ou renderização de vídeos. Elas consomem mais energia, mas oferecem uma performance superior, ideal para usuários que exigem o máximo de sua máquina.\\n" +
                "\\n" +
                "-Desempenho:\\n" +
                "  -Slow: CPUs com desempenho mais lento são ideais para tarefas simples e pouco exigentes. São mais econômicas e indicadas para uso em dispositivos com pouca necessidade de processamento, como navegação básica na internet e aplicativos leves.\\n" +
                "  -Moderate: CPUs de desempenho moderado são adequadas para usuários que realizam tarefas variadas, como edição de textos e navegação na web, além de executar jogos e programas mais leves sem dificuldades.\\n" +
                "  -Fast: CPUs rápidas são ideais para tarefas intensivas que exigem grande poder de processamento, como edição de vídeos, jogos de última geração e softwares complexos, garantindo que tudo seja feito rapidamente e de forma eficiente.\\n" +
                "\\n" +
                "-Custo:\\n" +
                "  -Low: CPUs de baixo custo são acessíveis, mas com desempenho limitado. Elas atendem bem a necessidades básicas, como navegar na web, assistir vídeos e realizar tarefas simples.\\n" +
                "  -Medium: CPUs de custo médio oferecem um bom equilíbrio entre desempenho e preço, sendo adequadas para a maioria dos usuários que precisam de uma máquina versátil para uso diário e algumas tarefas mais exigentes.\\n" +
                "  -High: CPUs de alto custo são projetadas para proporcionar o máximo desempenho, com tecnologia de ponta e recursos avançados. Elas são ideais para profissionais que trabalham com softwares pesados, como edição de vídeo, IA e jogos.\\n" +
                "\\n" +
                "-Tipo de Aplicação:\\n" +
                "  -IoT (Internet das Coisas): Para dispositivos IoT, é importante uma CPU que consuma pouca energia, seja compacta e tenha capacidade de processar dados de sensores e dispositivos conectados de maneira eficiente. Essas CPUs são projetadas para operarem em ambientes de baixo consumo e com recursos limitados.\\n" +
                "  -IA (Inteligência Artificial): CPUs para IA precisam de alto desempenho, pois exigem grande capacidade de processamento para trabalhar com grandes volumes de dados, treinamento de modelos e execução de algoritmos complexos. Um bom equilíbrio entre consumo de energia e desempenho é necessário para garantir eficiência.\\n" +
                "  -Games (Jogos): CPUs para jogos precisam oferecer desempenho rápido e ser capazes de lidar com gráficos intensivos, renderização 3D e outros requisitos de jogos de última geração. Geralmente, essas CPUs consomem mais energia para garantir uma experiência de jogo sem lag ou quedas de performance.\\n" +
                "  -Edição de Vídeo: Para edição de vídeo, é essencial uma CPU com alto desempenho, capaz de lidar com grandes arquivos de vídeo e renderizações complexas. A alta performance e o rápido processamento são necessários para garantir uma edição fluída e sem interrupções.\\n\"}";

    }
}

