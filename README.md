# MyBatis 基础实战练习

本项目用于记录从原生 JDBC 向企业级 ORM 框架（MyBatis）过渡的学习过程。

## 🛠️ 技术栈
*   **语言**：Java (JDK 25)
*   **构建工具**：Maven (已配置阿里云镜像)
*   **数据库**：MySQL 8.0
*   **核心框架**：MyBatis 3.5.19

## ✨ 核心学习内容
1.  **Maven 依赖管理**：使用 `pom.xml` 引入 MySQL 驱动与 MyBatis 依赖。
2.  **核心配置文件**：编写 `mybatis-config.xml`，配置数据源（连接池）与事务管理器。
3.  **ORM 映射**：编写 `StudentMapper` 接口与 `StudentMapper.xml` 映射文件，实现 SQL 与 Java 对象的绑定。
4.  **CRUD 操作**：使用 `SqlSession.getMapper()` 获取代理对象，完成增、删、改、查。
5.  **事务控制**：深刻理解 MyBatis 默认不自动提交事务，手动执行 `sqlSession.commit()` 持久化数据。

## 🚀 运行说明
1. 本地创建 MySQL 数据库 `java_study`，并创建 `student` 表。
2. 修改 `src/main/resources/mybatis-config.xml` 中的数据库密码。
3. 运行 `com.demo.mybatis.TestMyBatis` 等测试类即可。
