<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateSancionesTable extends Migration
{
    /**
     * Schema table name to migrate
     * @var string
     */
    public $set_schema_table = 'Sanciones';

    /**
     * Run the migrations.
     * @table Sanciones
     *
     * @return void
     */
    public function up()
    {
        if (Schema::hasTable($this->set_schema_table)) return;
        Schema::create($this->set_schema_table, function (Blueprint $table) {
            $table->engine = 'InnoDB';
            $table->increments('sancionid');
            $table->unsignedInteger('jugadorid');
            $table->string('tiempo', 45)->nullable();
            $table->string('comentario', 200)->nullable();

            $table->index(["jugadorid"], 'jugadorid_idx');


            $table->foreign('jugadorid', 'jugadorid_idx')
                ->references('jugadorid')->on('Jugador')
                ->onDelete('no action')
                ->onUpdate('no action');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
     public function down()
     {
       Schema::dropIfExists($this->set_schema_table);
     }
}
