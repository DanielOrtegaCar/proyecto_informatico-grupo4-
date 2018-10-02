<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreatePartidoTable extends Migration
{
    /**
     * Schema table name to migrate
     * @var string
     */
    public $set_schema_table = 'Partido';

    /**
     * Run the migrations.
     * @table Partido
     *
     * @return void
     */
    public function up()
    {
        if (Schema::hasTable($this->set_schema_table)) return;
        Schema::create($this->set_schema_table, function (Blueprint $table) {
            $table->engine = 'InnoDB';
            $table->increments('partidoid');
            $table->unsignedInteger('equipo_1')->nullable();
            $table->unsignedInteger('equipo_2')->nullable();
            $table->unsignedInteger('divisionid')->nullable();
            $table->unsignedInteger('lugarid')->nullable();
            $table->unsignedInteger('ganador')->nullable();
            $table->date('fecha')->nullable();
            $table->string('hora', 45)->nullable();

            $table->index(["divisionid"], 'divisionid_idx');

            $table->index(["ganador"], 'ganador_idx');

            $table->index(["equipo_1"], 'equipo1_idx');

            $table->index(["lugarid"], 'lugar_idx');

            $table->index(["equipo_2"], 'equipo2_idx');

            $table->unique(["partidoid"], 'partidoid_UNIQUE');


            $table->foreign('lugarid', 'lugar_idx')
                ->references('lugarid')->on('Lugar')
                ->onDelete('no action')
                ->onUpdate('no action');

            $table->foreign('ganador', 'ganador_idx')
                ->references('equipoid')->on('Equipo')
                ->onDelete('no action')
                ->onUpdate('no action');

            $table->foreign('divisionid', 'divisionid_idx')
                ->references('divisionid')->on('Division')
                ->onDelete('no action')
                ->onUpdate('no action');

            $table->foreign('equipo_1', 'equipo1_idx')
                ->references('equipoid')->on('Equipo')
                ->onDelete('no action')
                ->onUpdate('no action');

            $table->foreign('equipo_2', 'equipo2_idx')
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
