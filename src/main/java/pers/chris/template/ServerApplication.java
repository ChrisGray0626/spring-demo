package pers.chris.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import springfox.documentation.oas.annotations.EnableOpenApi;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Chris
 * @Date 2022/3/17 11:00 AM
 * @Description 启动类
 */

@EnableOpenApi
@SpringBootApplication
@Slf4j
public class ServerApplication {

    public static void main(String[] args) throws UnknownHostException {
        Environment env = new SpringApplication(ServerApplication.class).run(args).getEnvironment();
        String envPort = env.getProperty("server.port");
        String envContext = env.getProperty("server.contextPath");
        String port = envPort == null ? "8080" : envPort;
        String context = envContext == null ? "" : envContext;
        String path = port + "" + context + "/swagger-ui/index.html";
        String externalAPI = InetAddress.getLocalHost().getHostAddress();
        String[] applicationName = env.getActiveProfiles();
        log.info(
                "\n----------------------------------------------------------\n" +
                        "Application '{}' is running! Access URLs:\n" +
                        "Local-API: \t\t http://127.0.0.1:{}\n" +
                        "External-API: \t \t http://{}:{}\n" +
                        "\n----------------------------------------------------------",
                applicationName, path, externalAPI, path);
    }

}
