import java.util.ArrayList;
import java.util.List;

    public class Automovel {

        private String marca;
        private String modelo;
        private int ano;
        private int km;
        private float valor;

        private String cpfDono;

        private List <String> donos;
        private List <String> historico = new ArrayList<>();

        public Automovel(String marca, String modelo, int ano, int km, float valor) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.km = km;
            this.valor = valor;
            this.donos = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Automovel{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", ano=" + ano +
                    ", km=" + km +
                    ", valor=" + valor +
                    ", donos=" + donos +
                    ", cpfDono='" + cpfDono + '\'' +
                    '}';
        }

        public String getMarca() { return marca; }
        public void setMarca(String marca) { this.marca = marca; }

        public String getModelo() { return modelo; }
        public void setModelo(String modelo) { this.modelo = modelo; }

        public int getAno() { return ano; }
        public void setAno(int ano) { this.ano = ano; }

        public int getKm() { return km; }
        public void setKm(int km) { this.km = km; }

        public float getValor() { return valor; }
        public void setValor(float valor) { this.valor = valor; }

        int i = -1;
        public void adicionarProprietarios(String cpfDono) {
            this.cpfDono = cpfDono;
            donos.add(cpfDono);
            historico.add(cpfDono);
            System.out.println("Proprietário adicionado...");

        }

        public void removerProprietarios(String cpfDono){
            donos.remove(cpfDono);
            System.out.println("Proprietário removido. ");
        }

        public void exibirProprietarios(){
            //lista de propietarios

            System.out.println("");
            System.out.println( "Historico de CPFs de proprietários " + historico);
            System.out.println("");
            System.out.println("CPF do proprietário atual: " + cpfDono);
        }
    }
