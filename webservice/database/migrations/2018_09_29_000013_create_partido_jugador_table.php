<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreatePartidoJugadorTable extends Migration
{
    /**
     * Schema table name to migrate
     * @var string
     */
    public $set_schema_table = 'partido_jugador';

    /**
     * Run the migrations.
     * @table partido_jugador
     *
     * @return void
     */
    public function up()
    {
        if (Schema::hasTable($this->set_schema_table)) return;
        Schema::create($this->set_schema_table, function (Blueprint $table) {
            $table->engine = 'InnoDB';
            $table->increments('partidoid');
            $table->unsignedInteger('jugadorid');
            $table->integer('puntos')->nullable()->default('0');
            $table->integer('triples')->nullable()->default('0');
            $table->tinyInteger('amarilla')->nullable()->default('0');
            $table->tinyInteger('roja')->nullable()->default('0');
            $table->integer('faltas_b')->nullable()->default('0')->comment('faltas basquetball');

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
