<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateJugadorTable extends Migration
{
    /**
     * Schema table name to migrate
     * @var string
     */
    public $set_schema_table = 'Jugador';

    /**
     * Run the migrations.
     * @table Jugador
     *
     * @return void
     */
    public function up()
    {
        if (Schema::hasTable($this->set_schema_table)) return;
        Schema::create($this->set_schema_table, function (Blueprint $table) {
            $table->engine = 'InnoDB';
            $table->increments('jugadorid');
            $table->unsignedInteger('equipoid');
            $table->string('nombre', 160)->nullable();
            $table->integer('edad')->nullable();
            $table->integer('ano_ingreso')->nullable();

            $table->index(["equipoid"], 'equipoid_idx');

            $table->unique(["jugadorid"], 'jugadorid_UNIQUE');


            $table->foreign('equipoid', 'equipoid_idx')
                ->references('equipoid')->on('Equipo')
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
