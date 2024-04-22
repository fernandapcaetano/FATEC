class Uva_verde extends Uva{

    protected $madura;

    public function __construct($e){
        paren::__construct($e);
    }

    public function set_origem($madura){
        $this->madura = $madura;
    }

    public function get_origem(){
        $this->madura;
        if($this->madura == True){
            return "Sim";
        }
        return "Não";
    }

    public function atributos{
        echo nl2br("Neto da fruta");
    }

}