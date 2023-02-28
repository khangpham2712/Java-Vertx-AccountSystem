package vn.zalopay.zas.account.config;

import java.io.FileInputStream;
import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class FileConfigLoader {
  private static final Logger log = LoggerFactory.getLogger(FileConfigLoader.class);

  public static ServiceConfig loadFromEnv(String path) {
    ServiceConfig config = null;
    try {
      InputStream inputStream = new FileInputStream(path);
      Yaml yaml = new Yaml(new Constructor(ServiceConfig.class));
      config = yaml.load(inputStream);
    } catch (Exception e) {
      log.error("Something went wrong while reading from file: {}", e.getMessage());
    }
    return config;
  }
}
