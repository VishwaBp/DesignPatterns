package org.example.Builder;



public class Database {

    String host;
    String port;
    String username;
    String password;
    String databaseName;
    String databaseType;
    String databaseVersion;

    private Database() {
    }
    @Override
    public String toString() {
        return "Database{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", databaseName='" + databaseName + '\'' +
                ", databaseType='" + databaseType + '\'' +
                ", databaseVersion='" + databaseVersion + '\'' +
                '}';
    }

    public static class DatabaseBuilder{
        private String host;
        private String port;
        private String username;
        private String password;
        private String databaseName;
        private String databaseType;
        private String databaseVersion;

        public DatabaseBuilder host(String host) {
            this.host = host;
            return this;
        }

        public DatabaseBuilder port(String port) {
            this.port = port;
            return this;
        }

        public DatabaseBuilder username(String username) {
            this.username = username;
            return this;
        }

        public DatabaseBuilder password(String password) {
            this.password = password;
            return this;
        }

        public DatabaseBuilder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public DatabaseBuilder databaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        public DatabaseBuilder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            return this;
        }

        public String getHost() {
            return host;
        }

        public String getPort() {
            return port;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getDatabaseName() {
            return databaseName;
        }

        public String getDatabaseType() {
            return databaseType;
        }

        public String getDatabaseVersion() {
            return databaseVersion;
        }

        public Database build() {
                Database database = new Database();
                database.host = this.host;
                database.port = this.port;
                database.username = this.username;
                database.password = this.password;
                database.databaseName = this.databaseName;
                database.databaseType = this.databaseType;
                database.databaseVersion = this.databaseVersion;
                return database;
            }



    }
}
