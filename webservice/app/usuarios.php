<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $usuarioid
 * @property string $nombre
 * @property string $correo
 * @property string $password
 * @property boolean $admin
 */
class usuarios extends Model
{
    /**
     * The primary key for the model.
     * 
     * @var string
     */
    protected $primaryKey = 'usuarioid';

    /**
     * @var array
     */
    protected $fillable = ['nombre', 'correo', 'password', 'admin'];

}
