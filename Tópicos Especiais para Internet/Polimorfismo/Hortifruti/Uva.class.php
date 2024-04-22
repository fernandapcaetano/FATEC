class Uva extends Fruta{

    protected $origem;

    public function __construct($f){
        paren::__construct($f);
    }

    public function set_origem($origem){
        $this->origem = $origem;
    }

    public function get_origem(){
        return $this->origem;
    }
}